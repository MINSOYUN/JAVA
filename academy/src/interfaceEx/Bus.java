package interfaceEx;


// implements 구현하겠다
// Vehicle vehicle 인터페이스: 나는 인터페이스로 자동 형 변환이 가능하다
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 부아아아와앙");
	}
	
	public void checkFare() {
		System.out.println("승차요금 주세여~!!");
	}

}
