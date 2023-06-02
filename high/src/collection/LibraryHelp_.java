package collection;

import java.util.ArrayList;
import java.util.List;

public class LibraryHelp_ {
	/* List 인터페이스에 ArrayList 구현체를 사용하여 
	 List<Book> 객체 생성 */
	// List는 자바 컬렉션 프레임워크의 인터페이스 중 하나
	private List<Book> bookList = new ArrayList<>();
	
	public LibraryHelp_() {
		
	}

	// List<Book> 객체를 받아서 bookList 필드를 초기화
	public LibraryHelp_(List<Book> bookList) {
		this.bookList = bookList;
	}

	// Book 클래스에 getter, setter 메서드 o -> private 필드에
	// 접근하여 매개변수로 사용할 수 있다
	public boolean addBook(String title, String author) {
		// 삭제된 책의 정보를 출력하기 위해 변수 book(책의 정보 저장) 사용
		Book book = new Book(title, author);
		return bookList.add(book);
	} 
	
	@Override
	public String toString() {
		int i=0;
		for(Book book : bookList) {
			System.out.println(i+": "+book.toString());
			i++;
		}
		return super.toString();
	}
	
	// lib.removeBook(i)의 값이 매개변수로 전달
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다\n"+book.toString());
	}

	public void updateBook(int index) {

		Book book = bookList.get(index);
		book.setRent(true); // 책 대여완료
		bookList.set(index, book);
	}
	
}

