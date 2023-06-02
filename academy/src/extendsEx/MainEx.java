package extendsEx;

public class MainEx {
	public static void main(String[] args) {
		
		// 부모 타입으로 자식 객체를 생섳합니다.
		// 자동형변환 됩니다
		Airplane airplane =new SupersonicAirplane(
				SupersonicAirplane.SUPERSONIC);
		
		// 부모타입으로 변환시
		// 1. 부모가 가지고 있는 필드 또는 메서드에만 접근이 가능하다
		// 2. 재정의 메서드 호출시 - 자식객체에서 재정의한 메서드가 호출
		
		System.out.println("재정의 메서드 호출");
		airplane.fly();
		
		// 자식타입으로 형변환 - > 강제형변환(명시적)
		SupersonicAirplane supersonic =
		(SupersonicAirplane)airplane;
		
		// 원래 타입으로 변환 시 자식클래스가 가지고 있는
		// 필드 또는 메서드에 접근이 가능해진다
		System.out.println("자식타입으로 강제 형변환");
		supersonic.booster();
		System.out.println(supersonic.flymode);
		supersonic.fly();
	}
}
