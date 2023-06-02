package classEx;

public class Korean {
	// 필드
	String nation = "대한민국"; // 필드 생성과 동시에 초기화
	String name; //생성자에서 초기화 주기
	String ssn;
	
	// 기본생성자
	public Korean() {
		
	}
	public Korean(String name, String ssn) { 
		// 필드 초기화
		this.name = name;
		this.ssn = ssn;
//		String nation = a;
	}

}
