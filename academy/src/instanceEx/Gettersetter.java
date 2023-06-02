package instanceEx;

public class Gettersetter {
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
		// 필드값을 반환
		return speed;
	}
	
	public void setSpeed(int speed) {
		// 필드의 값을 변경
		// 검증 후 값을 변경합니다
		if(speed>0) {
			this.speed = speed;
		} else {
			this.speed = 0;
			System.out.println("값을 바꿀수 없습니다.");
		}
	}
	
	// true, false 리턴 is로 시작 -> boolean 인 경우가 많음
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		if(stop) {
			this.stop = stop;
		}
	}
	
	public static void main(String[] args) {
		Gettersetter car = new Gettersetter();
		// private 접근제한자를 이용한 경우
		// 필드에 직접 접근할 수 없으므로
		// setter 메서드를 이용해서 필드의 값을 변경 시켜 줄 수 있다
		car.setSpeed(-50);
		System.out.println("현재속도는 "+car.getSpeed());
		
		car.setSpeed(50);
		System.out.println("현재속도는 "+car.getSpeed());
		
		// true, false(초기값)
		// 멈추지 않은 상태라면 메서드를 호출
		if(!car.isStop()) {
			car.setStop(true);
			System.out.println("현재속도는 "+car.getSpeed());
		}
		
	}
	
}
