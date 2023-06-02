package classEx;

public class KoreanMain {

	public static void main(String[] args) {
		Korean korean = new Korean();
		korean.name = "";
		korean.ssn = "";
		
		System.out.println("==========");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.nation);
		
		// 객체 초기화
		Korean hong = new Korean("홍길동", "123456-789"); // (n, s)
		System.out.println("==========");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		
		Korean ha = new Korean("이하늬","456123-745");
		System.out.println("==========");
		System.out.println(ha.name);
		System.out.println(ha.ssn);
		System.out.println(ha.nation);
	}

}
