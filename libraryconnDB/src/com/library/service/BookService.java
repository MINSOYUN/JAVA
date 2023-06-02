package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

// 비즈니스 로직 - 목록을 보여주기 위한 클래스
/**
 * 비즈니스 로직
 * 사용자의 요청에 대한 검증
 * DB조회
 * 사용자 요구에 맞게 반환
 * @author user
 *
 */
public class BookService {
	BookDao bookDao = new BookDao();
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
	} // getList
	
	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("입력되었습니다");
		} else {
			System.out.println("입력 중 오류가 발생했습니다");
		}
		return 0;
	}

	public void deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("삭제 되었습니다");
			// 책 리스트 출력
			getList();
		} else {
			System.out.println("삭제 오류가 발생했습니다");
		}
		
	}
	
	/**
	 * 책이 렌트 가능한 상태인지 확인
	 * 가능한 상태면 대여 처리
	 * 아니면 메세지 처리
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {
		// 대여 가능 여부를 판단
		boolean flg = selStatus(bookNo,"N");
		System.out.println();
		if(flg) {
			int res = bookDao.updateBook(bookNo,"Y");
			if(res>0) {
				System.out.println("대여 되었습니다");
				getList();
			} else {
				System.out.println("대여중 문제가 발생하였습니다");
			}
		} else {
			System.out.println("대여가 불가능한 상태입니다");
		}
	}
	
	/**
	 * 대여/반납 가능한 책인지 조회 합니다
	 * @param no
	 * @param resntYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no,rentYN);
		return res;
	}

	public void returnBook(int bookNo) {
		boolean flg = selStatus(bookNo,"Y");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "N");
			if(res>0) {
				System.out.println("반납 되었습니다");
				getList();
			} else {
				System.out.println("반납중 문제가 생겼습니다");
			}
		} else {
			System.out.println("반납이 불가능한 상태입니다");
		}
	}
	
}
