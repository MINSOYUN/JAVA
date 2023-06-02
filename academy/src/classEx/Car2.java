package classEx;

public class Car2 {
	// 필드 생성
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 갯수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징 2가지
	public Car2() { // 기본생성자
		// 생성자호출
		// this. 필드
		// this() 생성자
		// 생성자를 사용하기 위해서는 매개변수에 알맞는 파라미터를 넣어줍니다.
		// 1. 생성자에서 다른 생성자를 호출 할 수 있다
		// -> 중복되는 코드를 줄이기 위해서
		this("기본모델", "블랙", 150);
	}
	public Car2(String model) { // 매개변수가 있으므로 생성자
		// -> 코드블럭 안에서는 로컬변수가 우선되므로 아무런 의미가 없음
		this(model,null,0); // color 기본값, 속도 150으로 초기화 할게
//		 this.model = model; // this.필드명 = 매개변수명;
	}
	// 생성자오버로딩
	public Car2(String model, String color) { // 갯수, 타입 다름
		// 생성자를 호출 하는 것은 첫번째 줄에서만 가능합니다.
		 this(model, color, 150); // 속도는 150으로 초기화할게
//		 this.model = model;
//		 this.color = color;
	}
	public Car2(String model, String color, int maxSpeed) { //갯수, 타입 다름
		 this.model = model;
		 this.color = color;
		 this.maxSpeed = maxSpeed;
	}
	public Car2(String model, int maxSpeed) {
		this(model, null,maxSpeed);// 타입 다름
//		this.model = model;
//		this.maxSpeed = maxSpeed;
	}
//	public Car2(String color, String model) {
		
//	}
	
	
}
