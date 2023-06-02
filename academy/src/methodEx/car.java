package methodEx;

public class car {
	public int gas; // 필드생성
	
	// 생성자: gas 초기화
	car(int gas) {
		this.gas = gas; // this.gas = 매개변수;
	}
	public void run1() { // 메서드
		System.out.println("쌩쌩 달립니다");
		// 내부 메서드를 호출합니다.
		stop();
		// 이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아서 실행합니다.
		sound("빵빵"); //sound(String sound)
	}
	
	public void stop() { // run1 내부메서드로 사용됨
		System.out.println("멈춥니다");
		
	}
	public void sound(String sound) { // run1 내부메서드로 사용됨
		System.out.println(sound);
	}
			
	// boolean 타입이 반환인 경우 메서드의 이름에 is가 붙는 경우가 많다. isLeftGas()
	// 기름이 0이면 false를 반환
	public boolean isLeftGas() { // 메서드
		if(gas > 0) {
			return true; // 메인메서드 if 값 true
		} else {
			return false; // 메인메서드 if 값 false
		}
	} // isLeftGas 메서드 끝
	
	
	public void run() {  // 메서드
		while(true) {
			if(gas>0) {
				gas -= 1; // gas = gas -1;
				System.out.println("달립니다");
				System.out.println("남은 기름: " + gas);
			} else {
				System.out.println("기름이 떨어졌어요!!");
				System.out.println("남은 기름: "+ gas);
//				break; //: 반복문 탈출
				return; // 강제종료, else 블럭 안에 작성
			} 
		} // while 문 끝
	}  // run 메서드끝
	
}
