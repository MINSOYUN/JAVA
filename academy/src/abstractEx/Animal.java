package abstractEx;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	public void print(Animal animal) {
		System.out.println("=========");
		animal.sound();
		System.out.println(animal.kind);
		System.out.println("=========");
	}
	
	// 추상메서드: 미완성 메소드 (코드블럭이 미완성되었음)
	public abstract void sound();
}
