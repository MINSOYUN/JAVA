package methodEx;

public class CarSpeed {
	// 필드: 속성을 정의
	// 정수 speed;
	public int speed;
	
	// 생성자: new 연산자에 의해 객체를 생성할 때 호출
	// 기본 생성자
	CarSpeed() {
	}	
	// speed를 매개변수로 받는 생성자
	CarSpeed(int speed){ // 클래스(매개변수) { }
		
	}
	
	// 메서드: 기능을 정의
	// getSpeed(): int
	public int getSpeed() {
		return speed;
	}
	// keyTurnOn(): void
	public void keyTurnOn() {
		System.out.println("시동을 켭니다");
	}
	// run(): void
	// 속도를 10씩 증가시키면서 50까지 속도를 출력합니다
	public void run() {
		for(int i =0; i<=50; i+=10) {
			// 필드에 값을 설정
			speed = i;
			System.out.println("시속: "+speed);
		}
	}
	
	public static void main(String[] args) {
		// static: 생성 후 호출
		CarSpeed car = new CarSpeed(); // car 객체생성
		car.keyTurnOn();
		int speed =  car.getSpeed(); //리턴값 int
		System.out.println("현재속도: "+speed);
		// 객체 생성하고 메서드 사용 가능
		car.run(); // run 메서드 호출
		
	}
	
}
