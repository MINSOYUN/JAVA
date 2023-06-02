package interfaceEx;

public class MyclassMain {
	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성 후 
		// 참조타입 변수에 저장
		Myclass myclass = new Myclass();
		// 1. 인터페이스가 필드에 사용된 경우
		// 1-1.myclass의 필드에 접근 -> RemoteControl rc = new SmartTv()
		myclass.rc.turnOn();  // new SmartTv()
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		System.out.println("============");
		
		// 1-2.
		myclass.rc = new Audio(); // new Audio()
		myclass.rc.turnOn();
		myclass.rc.setVolume(5);
		myclass.rc.turnOff();
		System.out.println("===========");
		
		// 2. 인터페이스(RemoteControl)가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체(new Audio())를 생성하여 매개변수로 전달
		Myclass myclass1 = new Myclass(new Audio()); // new Audio()
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(10);
		myclass1.rc.turnOff();
		System.out.println("=========");
		
		// 3. 인터페이스가 메서드의 매개변수로 이용된 경우
		// 기본생성자로 생성하면 rc는 new SmartTv();로 생성도비니다
		// 필드의 선언부에서 생성하고 있기 때문에.
		Myclass myclass2 = new Myclass();
		// 인터페이스(RemoteControl)가 메서드의 매개변수 타입(RemoteControl rc)으로 사용될 경우
		// 메서드 호출 시 구현 객체(new Audio())를 매개값으로 대입합니다.
		myclass2.methodB(new Audio());
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(10);
		myclass2.rc.turnOff();
		System.out.println("==========");
		
		Myclass myclass3 = new Myclass();
		// 4. 메서드에 선언된 로컬변수를 rc에 저장 
		myclass3.methodA(); // rc =new Audio(); 
		myclass3.rc.turnOn();
		myclass3.rc.setVolume(4);
		myclass3.rc.turnOff();
		
	}
}
