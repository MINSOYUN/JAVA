package classEx;

public class car_person {

	public static void main(String[] args) {
		// new Car(); 생성자 오류 뜨면
		// 1. 매개변수가 없는 생성자를 만들어주거나 2. 매개변수를 넣어주거나
		Car car = new Car();
		Car car2 = new Car("기아자동차");
		
		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다
		System.out.println("car.company: "+car.company);
		car.speedUp(); // 메서드호출, 호출하지 않으면 결과 0
		System.out.println("car.speed: "+car.speed);
		System.out.println("car2.company: "+car2.company);
	}

}
