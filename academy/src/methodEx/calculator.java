package methodEx;

public class calculator {
	// true: 켜짐, false: 꺼짐 / 초기값: false
	boolean powerOn; // 필드 선언
	
	/**
	 * 전원을 키거나 끕니다
	 */
	public void powerOn() { // 메서드, 매개변수 필요x
		// boolean 은 true(1), false(0)만 있기 때문에 변수 넣을 수 있다.
		// boolean 기본값 false
		if(powerOn) { // if(false)
			powerOn = false;
			System.out.println("계산기를 종료합니다");
		} else { // powerOn은 false 이기 때문에 else가 실행된다
			powerOn = true; //  power = true; 로 변경 
			System.out.println("계산기를 실행합니다");
		}
	}
	
	public int add(int num1, int num2) {
		// powerOn = true
		if(powerOn) {
		return num1 + num2; //실행
		} else {
			System.out.println("계산기를 실행 해주세요");
			return 0; // 반환타입 int라 return 문 있다.
		}
	}
	
	// 오버로딩
	public int add(int[] numbers) { // int[] numbers = {.....};
		int sum = 0;
		for(int num: numbers) { // 배열 타입 int
			sum += num;
		} return sum;
		
	}
	
	// 배열로 들어온다
	// int 타입 여러개 입력 => 배열로 받아서 사용
	public int addFn(int ... numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		} return sum;
	}
}
