package objectEx;

public class Library {

	@Override
	public String toString() {
		String str = "";
		for(Book b: bookArry) {
			str += b.getTitle() + " "+b.getAuthor()+"\n";
		}
		return str;
	}
	
	// 책 리스트
	private Book[] bookArry = new Book[5];
	
	/**
	 * 책 목록 추가
	 */
	// 책을 세팅
	public void addBook() {
		bookArry[0] = new Book("혼자공","웩");
		bookArry[1] = new Book("자바의정석","어렵다");
		bookArry[2] = new Book("두잇자바","에..");
		bookArry[3] = new Book("불편한편의점","재밌다");
		bookArry[4] = new Book("너무열심히산거같다","맞다");
	}
}
