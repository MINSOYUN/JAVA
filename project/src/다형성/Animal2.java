package 다형성;

public abstract class Animal2 {
	private String name;
	private String kinds;
	
	protected Animal2() {
		
	}

	public Animal2(String name, String kinds) {
		// 초기화
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	public String toString() {
		return "저의 이름은 "+name+"이고, 종류는 "+kinds+"입니다. 룰루~!";
	}
	
	// 클래스가 추상메서드를 포함할 경우 추상클래스가 되어야 한다
	public abstract void speak();
	
	
}
