package practice;

public class Tv implements Func {

	@Override
	public void turnOn() {
		System.out.println("티비켬");
	}

	@Override
	public void turnOff() {
		System.out.println("티비끔");
	}

	@Override
	public void volume() {
		System.out.println("티비볼륨");
	}
	
	void siri() {
		System.out.println("시리");
	}
	
}
