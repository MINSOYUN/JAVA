package classEx;

public class Car {
	// 필드
	// 값을 초기화 해주지 않으면 초기값을 입력
	String company = "현대자동차";
	String model = "그랜저";
	int speed;   // 0
	boolean engineStrat;  // false
	
	public Car(String company) { // 생성자, 매개변수에 필드 넣어 완성
		// 필드의 이름과 매개변수의 이름이 동일한 경우 lv인 매개변수가  우선
		// 결과적으로 블럭 내부에서 company 값은 매개변수의 값을 가르키고 있다
		// this: 생성된 객체를 의미
		this.company = company;
	}
	
	// 매개변수가 없는 기본 생성자
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자
	// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다.
	public Car() { 
	}

	
	public void speedUp() {
		speed+=10; // speed = speed + 10
	}
	



	public static void main(String[] args) {
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("car.company: "+car.company);
		System.out.println("speed: "+car.speed);
		System.out.println();
		
		car.speedUp(); // 메서드기능
		System.out.println("car.speedUp()");
		System.out.println("speed: "+car.speed);
		System.out.println();
		
		car.speed =100;  
		// 만약 값을 넣고 speddUp() 메소드 부르면 100 +10
		System.out.println("car.speed = 100");
		System.out.println("speed: "+car.speed);
//		System.out.println(car.speedUp()); 반환이 없으면 오류
	}
}

