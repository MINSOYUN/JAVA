package classEx;

public class CarMain {

	public static void main(String[] args) {
		// 생성자를 호출 할 때는 생성자의 매개변수타입에
		// 맞춰서 순서대로 입력해줘야 한다
		// 메서드또는 생성자의 위치로 이동하는 방법
		// f3 또는 ctrl +클릭
		
		Car2 car = new Car2(); // 기본생성자 호출
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		System.out.println();
		
		
		// Car2[] car = new Car2
		// car2[0] = new Car2("그랜져");
		Car2 car1 = new Car2("그랜져"); // 생성자호출(매개변수명);
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println();
		
		Car2 car2 = new Car2("Sm5", "블랙");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println();
		
		Car2 car3 = new Car2("소나타", "블랙",200);
//		System.out.println(car3.company+car3.model+car3.color+car3.maxSpeed);
		System.out.printf("%s\n%s\n%s\n%ds",car3.company,car3.model,car3.color,car3.maxSpeed);
//		System.out.println(car3.model);
//		System.out.println(car3.color);
//		System.out.println(car3.maxSpeed);
	}

}
