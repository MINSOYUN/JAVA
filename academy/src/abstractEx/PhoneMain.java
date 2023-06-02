package abstractEx;

public class PhoneMain {
	public static void main(String[] args) {
		// 추상 클래스는 미완성 된 메서드를 포함하기 있으므로 생성할 수 없다
//		Phone phone = new Phone();
		// 추상클래스를 상속받아 추상메서드를 모두 구현 하면 일반클래스로 생성 할 수 있다
		SmartPhone sp = new SmartPhone("owner");
		// 참조형 변수의 타입(Phone)으로 사용이 가능하다
		// -> 다형성을 활용할 수 있다
		Phone phone = new SmartPhone("캔디");
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
	}
}
