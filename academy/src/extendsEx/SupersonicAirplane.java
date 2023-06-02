package extendsEx;

// 상속받을 때 사용하는 키워드
// extends + 부모
public class SupersonicAirplane extends Airplane{
	// 상수: 한번 정의 후 값을 변경할 수 없다
	// 대문자로 작성하고 단어를 연결하는 경우 _를 붙여준다
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 필드, 비행상태
	public int flymode;
	
	// 생성자, 매개변수를 받아서 flymode를 세팅
	public SupersonicAirplane(int flymode) {
		System.out.println("====SupersonicAirplane생성합니다");
		// 부모가 가지고 있는 메서드를 자식클래스에서 재정으
		// 메서드를 재정의 해도 기존에 부모가 가진 메서드르 호출 할 수 있다.
		// super.fly();
		if(flymode == NORMAL || flymode == SUPERSONIC) {
			// 넘어온 값을 세팅
			this.flymode = flymode;
		} else {
			flymode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		} else {
			// fly 재작성했지만
			// 부모가 가지고 있는 메서드를 호출
			// super를 이용해서 접근(오버라이드)
			super.fly();
		}
	}
	// 자식 객체만 가지고 있는 메서드
	public void booster() {
		System.out.println("부스터작동!");
	}
	
}
