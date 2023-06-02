package objectEx;

public class LibraryMain {
	// 메인메서드
	public static void main(String[] args) {
		// Library 객체생성
		Library lib = new Library();
		lib.addBook();
		
		// 도서관 주소값출력
		System.out.println(lib.toString());
		
		
	}
}
