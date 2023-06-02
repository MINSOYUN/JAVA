package interfaceEx;

public class Main {
	public static void main(String[] args) {
		// 인터페이스는 생성할 수 없지만
		// 참조변수의 타입으로 사용할 수 있다.
		
		
		// 인터페이스 변수 = new 구현객체; -> 인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		
//		Television tv = new Television();
//		tv.turnOn();
//		tv.setVolume(12);
//		tv.turnOff();
		
		// 상속 단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		// 인터페이스의 타입으로 구현이 가능하다
		RemoteControl smartTv = new SmartTv();
		smartTv.turnOn();
		smartTv.setVolume(-1);
		smartTv.turnOff();
		
		
		SmartTv st = new SmartTv();
		st.setVolume(-4);
		st.search("dddd");
		
		Searchable s = new SmartTv();
		Television tv = new SmartTv();
		s.search("dddd");
		
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
		
	}
}
