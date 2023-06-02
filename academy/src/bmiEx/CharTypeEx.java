package bmiEx;

public class CharTypeEx {

	public static void main(String[] args) {
		// 홀따옴표 안에 하나의 문자를 저장
		char var1 = 'A';
		char var2 = '야';
		
		char var3 = 65;
		char var4 = 0x0041;
		
		// 문자열을 저장(문자도 가능)
		String var5 = "배고파";
		
		// 정수의 리터럴이 입력되면 int 로 받아들이기 때문에 
		// long 타입의 경우 숫자뒤에 L 또는 l을 입력 합니다.
		long var6 = 123456789123456789L;
		
		// 실수타입
		// 실수의 리터럴이 입력되면 double형으로 받아 들이기 때문에
		// float타입의 경우 무조건 f를 붙인다
		float var7 = 0.1234f;
		double var8 = 0.123456789;
		float var9 = 5e-3f;
		
		// 논리리터럴
		boolean var10 = true;
		boolean var11 = false;
		// 참 거짓을 판단하기 때문에 "" 작성 x, 문자열과는 다름!
		if(false) {
			// 참일 때
			System.out.println("true");
		} else {
			// 거짓일 때
			System.out.println("boolean 출력 확인");
			System.out.println(false);
		}
		
		
		// 타입 변환: 변수 앞괄 호 안에 타입을 넣어줍니다!
		System.out.println("------char 타입 실습-----");
		System.out.println((int)var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println("------이스케이프-----");
		System.out.println("\"");
		System.out.println("나는\n오늘\n\'순대국\'이\n먹고싶다");
		System.out.println("-------실수 타입 실습-----");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println("----논리리터럴----");
		System.out.println(var10);
		System.out.println(var11);
		
	}

}
