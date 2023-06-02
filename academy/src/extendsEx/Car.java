package extendsEx;

public class Car {
	// Tire 클래스를 참조변수로 사용
	// 초기값: null
	private Tire tireFR;
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;
	
	// 생성자
	Car(){ 
	    // 타이어 필드를 초기화
		tireFR = new Tire("FR",3);
		tireFL = new Tire("FL",3);
		tireBR = new Tire("BR",3);
		tireBL = new Tire("BL",3);
	}
	
	public Car(Tire tire1, Tire tire2,Tire tire3,Tire tire4) {
		tireFR = tire1;
		tireFL = tire2;
		tireBR = tire3;
		tireBL = tire4;
	}

	/**
	 * 바퀴를 굴려줍니다
	 * @return
	 */
	public int run() {
		System.out.println("굴러갑니다");
		 boolean next = tireFR.roll();
		 // 타이어 교체
		 if(!next) { // ! false = True  --- > 중괄호 실행된다
			 // next의 값은 false
			 System.out.println(tireFR.location+"교체");
			 // 다형성에 의해 자식객체는 부모와 타입으로 자동 형변환 된다
			 tireFR = new KumhoTire(tireFR.location, 3);
			 System.out.println();
			 return 1;
		 }
		 if(!tireFL.roll()) {
			 System.out.println(tireFL.location+"교체"); // 교체 할 타이어의 위치
			 // 교체 할 타이어 = 자식객체(필드.location, 필드.maxRotation)
			 tireFL = new KumhoTire(tireFL.location, 6); 
			 return 2;
		 }
		 if(!tireBR.roll()) {
			 System.out.println(tireBR.location+"교체");
			 tireBR = new KumhoTire(tireBR.location, 1);
			  return 3;
		 }
		 if(!tireBL.roll()) {
			 System.out.println(tireBL.location+"교체");
			 tireBL = new KumhoTire(tireBL.location, 10);
			  return 4;
		 }
		 return 0;
	}
	
	// 메서드
	/**
	 * 바퀴의 위치를 매개변수로 받아서
	 * 해당 위치를 바퀴를 교체하는 메서드
	 * @param location
	 */
	public void changeTire(int location) {
		switch (location) {
		case 1: {
			 tireFR = new KumhoTire(tireFR.location, 3);
			break;
		}
		case 2: {
			 tireFL = new KumhoTire(tireFL.location, 5); 
			break;
		}
		case 3: {
			tireBR = new KumhoTire(tireBR.location, 1);
			break;
		}
		case 4: {
			 tireBL = new KumhoTire(tireBL.location, 10);
			break;
		}

		}
	}
	
	
}
