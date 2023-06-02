package seco;

import java.util.List;

public class BookService {
	BookDao bookDao = new BookDao();
	public void getList() {
		// bookDao의 list 가져오기
		List<BookVo> list = bookDao.getlist();
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
	}
	
	// 메서드 int로 작성
	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("DB에 저장 성공");
		} else {
			System.out.println("DB에 저장실패");
		} return 0;
	}
	
	public int deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("Db에 저장 성공");
		} else {
			System.out.println("DB에 저장 실패");
		} return 0;
	}
	
	public void rentBook(int bookNo) {
		boolean flg = selStatus(bookNo,"N");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "Y");
			if(res>0) {
				System.out.println("대여되었습니다");
				getList();
			} else {
				System.out.println("대여중문제가 발생했습니다");
			}
		} else {
			System.out.println("대여가 불가능한 상태입니다");
		}
	}

	private boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no, rentYN);
		return res;
	}
	
	public void returnBook(int bookNo) {
		boolean flg = selStatus(bookNo, "Y");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "N");
			if(res>0) {
				System.out.println("반납되었습니다");
				getList();
			} else {
				System.out.println("반납 중 문제가 생겼습니다");
			}
		} else {
			System.out.println("반납이 불가능한 상태입니다");
		}
	}
	
}
