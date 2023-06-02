package collection;

public class LibraryMain {
	public static void main(String[] args) {
		Library_ lib = new Library_();
		
		// 책 추가
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");
		
		// 책 정보 출력
		lib.toString();
		
		// 책 삭제
		System.out.println("삭제할 책의 번호를 선택 해주세요");
		// scanner 이용해서 입력 받아보기
		int i=0;
		lib.removeBook(i);
		
		
		// 삭제 후 책 정보 재출력
		lib.toString();
		
		// 책 대여: book.isRent = true;
		System.out.println("대여할 책의 번호를 선택 해주세요");
		i=0;
		lib.updateBook(i);
		
		// 책 정보 출력
		
		lib.toString();
		// 검증: 책 목록의 사이즈보다 큰 값이 입력되었을 때 다시 입력 받을 수 있도록
		
	}
}
