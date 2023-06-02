package 다형성;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
		
	}
	
	public String toString() {
		String to = "저의 이름은"+name+"이고, 종류는 "+kinds+"입니다.";
		return to;
	}
	
	public abstract void speak();
	
}
