package instanceEx;

public class finalEx {
	
	static final double PI = 3.14;
	static final double EARTH_RADIUS = 6400;
	
	// 상수필드: 한번 값이 정해지고 나면 수정이 불가능
	final String nation = "대한민국";
	final String ssn;
	// 필드
	String name;
	
	finalEx(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// 상수는 값을 변경하는 것이 불가능!
		// this.ssn = "12345-6789";
		finalEx p = new finalEx("12345-6789", "홍길동");
		
		System.out.println(p.nation);
		System.out.println(p.ssn);
		System.out.println(p.name);
		
		// 상수 필드의 값을 변경할 수 없다
//		p.nation = "한국"; 오류 발생
		System.out.println(p.name = "홍사원");
		
		System.out.println("파이값: "+finalEx.PI);
		System.out.println("지구반지름: "+finalEx.EARTH_RADIUS);
		
	}
	
}
