package library_0427.service;

import java.util.List;

import library_0427.dao.BookDao;
import library_0427.vo.Book;

public class BookService {
	// 기본생성자 list를 가져오기위해 BookDao 생성한다
	BookDao dao = new BookDao();
	/**
	 * 책 리스트를 조회합니다
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = dao.getList();
		for(Book book : list) {
			// 객체만 작성해도 tostring 명시적으로 자동 호출된다
			System.out.println(book.toString());
		}  return list;
	} // 책 정보 조회
	
	public void insertBook(Book book) {
		int res = dao.insert(book);
		if(res>0) {
			System.out.println(res+"건 추가 되었습니다");
		} else {
			System.err.println(" 도서 추가 중 문제가 발생하였습니다");
			System.err.println("관리자에게 문의해주세요");
		} 
	}

	public void deleteBook(int no) {
		int res = dao.delete(no);
		if(res>0) {
			System.out.println(res+"건 삭제되었습니다");
		} else {
			System.err.println("도서 삭제 중 문제가 발생하였습니다");
			System.err.println("관리자에게 문의해주세요");
		}
	} // 삭제
	
	public void rentBook(int no) {
		String rentYN = dao.getRentYN(no);
			if("Y".equalsIgnoreCase(rentYN)) {
				System.err.println("이미 대여중인 도서입니다");
			} else if("".equalsIgnoreCase(rentYN)){
				System.err.println("없는 도서 번호입니다");
			} else {
				int res =dao.update(no, "Y");
				if(res>0) {
					System.out.println(res+"건 대여하였습니다");
				} else {
					System.err.println("도서 대여 중 문제가 발생하였습니다");
					System.err.println("관리자에게 문의해주세요");
				}
			}
	} // 도서 대여
	
	public void returnBook(int no) {
		String rentYN = dao.getRentYN(no);
		if("N".equalsIgnoreCase(rentYN)) {
			System.out.println("이미 반납한 도서입니다");
		} else if("".equalsIgnoreCase(rentYN)) {
			System.out.println();
		} else {
			System.out.println("도서 반납 중 문제가 발생하였습니다");
			System.err.println("관리자에게 문의해주세요");
		}
	}
	
	
}
