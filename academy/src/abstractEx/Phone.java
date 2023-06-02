package abstractEx;

// 추상 메서드가 있으면 자동으로 추상 클래스가 된다
// 추상 메서드가 없어도 abstract 키워드를 선언함으로써 추상 클래스가 될 수 있다
// 추상 클래스는 생성이 불가능하다
public abstract class Phone {
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner){
		this.owner = owner;
	}
	
	// 메서드
	// 코드블럭이 완성되어 있지 않음
	public abstract void turnOn();
	// 하위 클래스에게 작성을 강제한다
	// 미완성된 메서드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOff();
}
