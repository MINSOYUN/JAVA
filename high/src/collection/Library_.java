package collection;

import java.util.ArrayList;
import java.util.List;

public class Library_ {
	// 책 리스트 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다.
	private List<Book> bookList = new ArrayList<>();
	
	public Library_() {
		
	}

	public Library_(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	// add의 타입이 boolean이기 때문에 return값은 boolean
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		// 맨 마지막에 인덱스를 추가하고 객체를 저장
		// add 타입: boolean -> 책이 제대로 저장 true, 저장x false
		return bookList.add(book);
	} 
	
	// 책 정보 출력하는 메서드
	@Override
	public String toString() {
		// 책을 삭제하거나 대여하려면 인덱스 정보를 알아야하므로,
		int i=0;
		// 책의 목록을 출력
		// 리스트이기때문에 반복문 사용
		for(Book book : bookList) {
			System.out.println(i+": "+book.toString());
			i++;
		}
		return super.toString();
	}
	
	// 책 삭제하는 메서드
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다\n"+book.toString());
	}
	
	// 대여 여부 수정하는 메서드
	public void updateBook(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 */
		Book book = bookList.get(index);
		book.setRent(true); // 책 대여완료
		bookList.set(index, book);
	}
	
	
	
}
