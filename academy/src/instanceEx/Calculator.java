package instanceEx;

public class Calculator {
	
	// 필드 선언
	static double pi = 3.141592;
	static int i;
	
	// 메서드 선언
	// 어디에서나 사용 가능한, 프로그램 시작과 동시에 사용가능한
	// 반환타입 int, 메서드 이름 plus
	public static int plus(int i, int j) {
		return i+j;
	}
	public static int minus(int i, int j) {
		return i-j;
	}
	
	public static void main(String[] args) {
		// 정적 필드, 정적 메서드는 객체 생성하지 않고
		// 클래스 이름으로 접근하여 사용
		double res = 10*10*Calculator.pi;   // 타입 변수 =___ 클래스명.필드
		int plus = Calculator.plus(5, 4); // 객체 생성 x
		System.out.println(Calculator.plus(5, 4));
		
		i=10;
	}
	
	
	
}
