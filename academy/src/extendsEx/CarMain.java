package extendsEx;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car(new Tire("FR", 3), new KumhoTire("FL",3),
				 		new KumhoTire("BR",3), new KumhoTire("BL",3));
		// 10번 실행
		for(int i=0; i<10; i++) {
			car.run();
			int res = car.run();
			if(res>0) {
				car.changeTire(res);
			}
		}
		
	}
	
}
