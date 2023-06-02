package Ex;

import java.util.List;

public class BookService {
	BookDao dao = new BookDao();
	
	public List<Book> getList(){
		List<Book> list = dao.getlist();
		for(Book book : list) {
			System.out.println(book.toString());
		} return list;
	}
}
