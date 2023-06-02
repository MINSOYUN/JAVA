package practice;

public class Audio implements Func{

	@Override
	public void turnOn() {
		System.out.println("오디오켬");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오끔");
	}

	@Override
	public void volume() {
		System.out.println("오디오볼륨");
	}
	
	void time() {
		System.out.println("시간");
	}
	
	

}
