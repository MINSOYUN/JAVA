package 객체;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book.information());
		System.out.println(book2.information());
		System.out.println("=============");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		System.out.println("수정된 결과 확인");
		System.out.println(book.information());
		System.out.println("==============");
		
		book.calc();
		book2.calc();
		
		
	}

}
