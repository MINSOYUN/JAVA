package interfaceEx;

public class CarMain {
	public static void main(String[] args) {
		
		// 객체를 생성
		// ㅐㄴ가 정의해 놓은 class를 타입으로 사용
		KumhoTire kumho = new KumhoTire();
		// kumhoTire가 tire를 구현 하고 있으므로 tire로 자동 형변환된다
		Tire tire = new KumhoTire();
		// 다형성: 여러가지 타입을 가질 수 있는 성질
		// 1. 상속: 자식 클래스는 부모타입으로 선언 할  수 있다
		//       : 부모타입으로 자동 형변환 된다
		// 2. 인터페이스: 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다
		//           : 인터페이스타입으로 자동 형변환된다
		
		
		// 다형성
		// 매서드 재정의 (오버라이딩)
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체가 파라미터로 사용됩니다.
		// 인터페이스의 구현체는 추상 메서드를 모두 구현 해야 하며 구현체가 구현한 메서드가 실행 됩니다.
		Car kumho1 = new Car(new KumhoTire());
		Car hankook = new Car(new HankookTire());
		kumho1.run();
		hankook.run();
		
		Car car = new Car();
		car.tire = new KumhoTire();
		
	}
}
