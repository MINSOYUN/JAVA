package interfaceEx;

public class Television implements RemoteControl {

//	private int volume;
	protected int volume;
	
	
	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// 인터페이스에서 정의한 3개의 추상메서드를 모두 구현해야 한다.
	// 2개만 구현 한 경우 -> 추상 클래스가 된다
	@Override
	public void setVolume(int volume) {
	
		if(volume>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨: "+this.volume);
	}

}
