package classEx;

public class Board {
	// 필드 정의
	// 제목
	String title;
	// 내용
	String content;
	// 작성자
	String writer;
	// 작성일
	String date;
	// 조회수
	int hitcount;
	// 생성자 특징: 클래스이름과 동일하다, 반환타입이 없다
	public Board(String title, String content) {
		// 생성자: 필드 초기화
//		this.title = title;
//		this.content = content;
		this(title, content, "로그인한 회원아이디","현재 컴퓨터 날짜",0);
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
	}
	
	public Board(String title, String content,
			String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	
	}
	
}
