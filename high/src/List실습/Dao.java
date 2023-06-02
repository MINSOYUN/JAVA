package List실습;

import java.util.List;

public interface Dao {
	// 책 리스트를 조회
	List<Book> getBooklist();
	
	// 신규 도서 등록
	int insertBook(List<Book> List);
	// 도서 삭제
	int deleteBook(List<Book> List);
	// 도서 정보 업데이트
	int updateBook(List<Book> List);
	
}
