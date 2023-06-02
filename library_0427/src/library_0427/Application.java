package library_0427;

import java.util.List;

import library_0427.controller.LibraryController;
import library_0427.dao.BookDao;
import library_0427.dao.MemberDao;
import library_0427.dao.RentDao;
import library_0427.vo.Book;
import library_0427.vo.Member;

public class Application {
	public static void main(String[] args) {
		
		LibraryController lib = new LibraryController();
		lib.library();
		
		BookDao dao = new BookDao();
		
		// book 데이터 삽입 확인
		//Book book = new Book (13,"불편한편의점","y","나카사키");
		//System.out.println(book.toString());
		
		// 삽입
		//Book book = new Book("불편한 편의점","나카사키");
		//dao.insert(book);
		
		// 삭제
		//dao.delete(11);
		
		// 수정
		//dao.update(12, "Y");
		
		// 조회
//		List<Book> list = dao.getList();
//		for(Book book1 : list) {
//		System.out.println(book1.toString());
//		}
		
		/*
		 * 리스트를 출력 하면 리스트의 요소들의 toString이 출력 된다  
		dao.getList().toString(); // -> 출력안된다
		System.out.println(dao.getList().toString());
		System.out.println("===============");
		System.out.println(dao.getList());
		 */
		
		MemberDao mdao = new MemberDao();
		// member 데이터 삽입 학인
//		System.out.println(mdao.login("ADMIN", "1234"));
		
		// 삽입
		// 기본값이 있다하더라도 생성자에서 전부 작성해야 하기 때문에 null로 작성해주기
		//Member member = new Member("ss","5678","쏘",null,null,null);
		//mdao.insertMember(member);
		
		// 중복조회
		System.out.println(mdao.idCheck("dfd"));
		
		// 삭제
//		mdao.deleteMember("ss");
		
	}
}
