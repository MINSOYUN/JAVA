package classEx;

public class person {

	public static void main(String[] args) {
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("car.company: "+car.company);
		System.out.println("speed: "+car.speed);
		System.out.println();
		
		car.speedUp(); // 메서드기능
		System.out.println("car.speddUp()");
		System.out.println("speed: "+car.speed);
		System.out.println();
		
		car.speed =100;  
		// 만약 값을 넣고 speddUp() 메소드 부르면 100 +10
		System.out.println("car.speed = 100");
		System.out.println("speed: "+car.speed);
//		System.out.println(car.speedUp()); 반환이 없으면 오류
	}

}
