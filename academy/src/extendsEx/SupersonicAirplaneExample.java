package extendsEx;

public class SupersonicAirplaneExample {
	public SupersonicAirplaneExample(){
		
	}
	
	public static void main(String[] args) {
		SupersonicAirplane supersonic =new SupersonicAirplane(SupersonicAirplane.NORMAL);
		supersonic.takeOff(); // 이륙합니다
		supersonic.fly(); // 일반비행입니다
		// * 가독성을 높여주기 위해 상수를 사용
		supersonic.flymode = SupersonicAirplane.SUPERSONIC;
		supersonic.fly(); // 초음속 비행입니다
		
		supersonic.flymode = SupersonicAirplane.NORMAL;
		supersonic.fly(); // 일반비행입니다
		
		// 착륙
		supersonic.land(); // 착륙합니다
		
	}
}
