package Ex;

import java.util.List;

public class Application {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		//dao.delete(12);
		//Book book = new Book(10,"아하","N","이건가");
		//dao.insert(book);
		//dao.update(14, "Y");
		
//		List<Book> list = dao.getlist();
//		for(Book book1 : list) {
//		System.out.println(book1.toString());
//	}
		
		MemberDao mdao = new MemberDao();
		//System.out.println(mdao.login("ADMIN", "1234"));
		//Member member = new Member("syhymin","1234","sy",null,null,null);
		//mdao.insertmem(member);
		//mdao.deletemem("syhymin");
		System.out.println(mdao.idcheck("dfd"));
		
		
}
}
