package List실습;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// 도서 리스트 - 메모리 (프로그램 종료 시 사라짐)
	private List<Book> bookList = new ArrayList<>();
	// 데이터의 입출력
	private Dao dao = null;
	/**
	 * 생성자
	 */
	Library(String confDao){
		if("db".equals(confDao)) {
//			this.dao =new DBDao();
		} else {
			this.dao = new FileDao();
		}
		// 책의 리스트를 조회(파일 또는 DB이용해서 조회)
		// 책을 생성해서 리스트에 담아 줄께요
		bookList = dao.getBooklist();
		// 등록된 책 리스트 출력
		System.out.println("라이브러리 생성자");
		System.out.println("도서목록");
		info();
		// TODO: 일련번호가 겹치지 않았으면 좋겠어요
		// DB 이용할 경우 번호를 기본키로 사용시 
		// 중복된 번호는 입력이 안되므로 오류 발생
//		bookList.add(new Book(1, "책1", "작가1", false));
//		bookList.add(new Book(2, "책2", "작가2", false));
//		bookList.add(new Book(3, "책3", "작가3", false));
//		bookList.add(new Book(4, "책4", "작가4", false));
	}
	
	/**
	 * 신규 도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	// 도서 추가
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		// 리스트에 책을 생성합니다
		Book book = new Book(no, title, author, isRent);
		bookList.add(book);
		// 리스트를 파일에 저장합니다 -> write
		dao.insertBook(bookList);
		return true;
	}
	
	/**
	 * 책의 일련번호를 매개변수로 받아서 
	 * 책의 정보를 수정합니다
	 * @param index
	 * @return
	 */
	// 도서 대여
	public boolean rentBook(int index) {
		for(Book book : bookList ) {
			// 사용자가 입력한 일련번호가 존재하는 (책을 찾은) 경우
			if(book.getNo() == index) {
				book.setRent(true);
				return true;
			}
		}
			System.err.println("일련번호에 해당하는 도서를 찿지 못했습니다");
			return false;
	}
	
	// 도서 정보를 출력 합니다
	public void info() {
		System.out.println("=============");
		// 리스트를 돌면서
		for(Book book : bookList) {
			// 책의 정보를 출력
			System.out.println(book.toString());
		}
		System.out.println("=============");
	}
	
	// 도서 삭제
	public boolean removeBook(int index) {
		for(Book book : bookList ) {
			// 책의 일련번호를 확인
			if(book.getNo() == index) {
				dao.updateBook(bookList);
				return bookList.remove(book);
			}
		}
		System.err.println("일련번호를 찾을 수가 없습니다");
		return false;
	}
	
	
	// 도서 반납
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			if(book.getNo() == index) {
				// 도서가 대여가능상태인 경우
				if(!book.isRent()) {
					System.err.println("반납 가능한 도서가 아닙니다.");
					return false;
				}
				// 대여 여부 변경 = 책의 정보를 수정
				book.setRent(false);
				dao.updateBook(bookList);
				return true;
			} 
		}
		System.err.println("일련번호를 찾지 못했습니다");
		return false;
	}
		
	
	public static void main(String[] args) {
		// 라이브러리 생성
		Library lib = new Library("db");
		// 도서 리스트 출력
		System.out.println("도서 리스트 출력");
		lib.info();
		// 신규 도서 등록
		System.out.println(" 신규 도서 등록");
		lib.insertBook(5, "책5", "작가5", false);
		lib.info();
		// 도서대여
		System.out.println("도서 대여 rentBook(1)");
		lib.rentBook(1);
		lib.info();
		// 도서 삭제
		System.out.println("도서 삭제 removeBook(3)");
		lib.removeBook(2);
		lib.info();
		// 도서 반납 
		System.out.println("도서 반납 returnBook(1)");
		lib.returnBook(1);
		lib.info();
		
	}
}
