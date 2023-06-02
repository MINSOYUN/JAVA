package com.library;

import java.io.FileWriter;
import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 책 목록
	// 필드로 선언 시 클래스 내부에서 자유롭게 이용이 가능하다
	// 전역 변수 -> Book 타입의 리스트 list 필드에서 선언
	private List<Book> list = null;
	
	// 인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해 선언
	private Dao dao = new FileDao();
	
	// 생성자: 클래스명과 같은 이름, 반환타입이 없다
	Library(){
		// 필드 초기화(생성자역할)
		list = dao.getList();
		System.out.println(toString());
	}
	
	Library(String daoType){
		if(daoType.equals("DB")) {
			dao = new DatabaseDao();
		}
		// 리스트 초기화
		list = dao.getList();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		System.out.println("====== 도서 목록 ======");
		// book 의 도서 정보를 저장할 String info 변수 생성
		String info = "";
		// 정렬 후 book에 저장 되도록
		// Collections.sort(리스트 변수명);
		Collections.sort(list);
		for(Book book : list) {
			// book의 정보 모두 저장해야 하기 때문에 +=
			// 개행문자 삽입하여 한줄씩 띄어가며 저장
			// 대여중, 대여가능으로 출력하고싶으므로 book.info로 출력
			info += book.info()+"\n";
		}
		return info;
	}
	
	// 책의 정보를 받아서 리스트에 등록. 등록 후 파일로 출력합니다
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		// 0. 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("일련번호가 중복되었습니다\n다시입력해주세요");
				return false;
			}
		}
		// 1. 책 생성
		Book book = new Book(no, title, author, isRent);
		// 2. 리스트에 등록
		list.add(book);
		// 3. 리스트를 파일로 출력
		boolean res = dao.ListToFile(list);
		System.out.println("책이 등록되었습니다");
		System.out.println(toString());
		// 4. 파일에 정상적으로 등록이 되지 않은 경우
		// 리스트에서 제거
		if(res) {
			return true;
		} else {
			// 리스트에 추가한 책을 제거
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다\t관리자에게문의해주세요");
			return false;
		}
	} // insertBook 끝
	
	/**
	 * 책의 일련번호를 입력 받아서 리스트에서 삭제 합니다.
	 * 리스트를 파일로 출력합니다
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		// 일련번호(no) 받아서 리스트에서 삭제(remove)
		// boolean이기 때문에 반환타입 true, false로 작성
		for(Book book : list) {
			// 검증
			if(book.getNo() == no) {
				// no를 remove하면 인덱스가 remove 되므로 book 자체를 지워야한다
				list.remove(book);
				// 리스트를 파일로 출력
				boolean res = dao.ListToFile(list);
//				System.out.println(res);
				if(!res) {
					// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가
					list.add(book);
					System.err.println("파일 출력도중 오류가 발생했습니다. Library.deleteBook()");
					return false;
				} 
					System.out.println("삭제 되었습니다.");
					System.out.println(toString());
					return true;
			}  
		} 
		// 입력받은 번호가 존재하지 않으면 false
		System.err.println("일치하는 일련번호가 없습니다. 일련번호를 확인해주세요"); 
		return false;
	} // deleteBook 끝
	
	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 상태가 렌트가 가능한 상태(isRent = false) -> 렌트(isRent = true)
	 * 렌트가 불가능한 상태 -> 메세지 처리
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				// isRent가 false 이기때문에 true로 중괄호 실행
				if(!(book.isRent())) {
					// 렌트 상태로 변경
					book.setRent(true);
					// 파일로 출력
					boolean res = dao.ListToFile(list);
					// 데이터베이스 업데이트
					// ========================
					int i = dao.update(no);
					if(i>0) {
						System.out.println(i+"건 처리되었습니다");
					} else {
						System.out.println("처리도중 오류가 발생했습니다");
						book.setRent(false);
					}
					// ============================
					if(!res) {
						book.setRent(false);
						System.out.println("파일로 출력하는데 실패했습니다");
					} // 파일 저장에 성공했을 때
					System.out.println("도서 대여가 완료됐습니다");
					System.out.println(toString());
					// return 값 종료
					return true;
				}
			} 
		}
		System.err.println("일련번호를 찾을 수 없습니다");
		return false;
	} // rentBook 끝
	
	/**
	 * 일련번호에 해당하는 도서를 찾는다
	 * 도서가 대여중(true)이라면 반납처리
	 * 대여중이 아니라면(반납가능한 도서가 아닙니다) 오류 메세지 처리
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				// true이면 -> 대여된 상태이면 false로 바꿔라
				if(book.isRent()) {
					book.setRent(false);
					dao.ListToFile(list);
					// ==================
					// DB 업데이트 로직 호출
					dao.update(no);
					System.out.println("도서를 반납하였습니다");
					System.out.println(toString());
					return true;
				} else {
					System.out.println("반납 가능한 도서가 아닙니다");
				}
			}
		} System.out.println("일련번호를 찾을 수 없습니다");
		return false;
	}
}
