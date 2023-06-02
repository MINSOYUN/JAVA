package 다형성;

public class Cat2 extends Animal2{
	private String location;
	private String color;
	
	Cat2(){
		
	}

	public Cat2(String name, String kinds, String location, String color) {
		super(name, kinds);
		setLocation(location);
		setColor(color);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString()+location+"에 서식하며, 색상은 "+color+"입니다");
	}
	
}
