package array;

public class person {
	protected String name;
	public int age;
	public double height;
	double weight;
	// 기본생성자: 초기화를 담당
	// 클래스명과 같은 이름, 반환 타입이 없다
	public person() {
		// 다른 생성자 호출
		// 초기화 값을 직접 입력
		// 생성자 this 에는 필드 값 사용 불가
		// 매개변수의 타입과 갯수가 일치해야지만 호출 할 수 있다.
		this("정우성", 30, 170, 60);
	}
	public person(String name, int age, double height, double weight) {
		// 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 접근제한자 반환타입 메서드명(매개변수타입 매개변수명)
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name + "," + age;
	}
	
	public static void main(String[] args) {
		person Person = new person();
		person hong = new person("홍길동",20,175.5,70.7);
		
		System.out.println(Person.information()); // 메서드의 name과 age과 출력
		System.out.println(hong.information());
		System.out.println();
		
		person[] personArr = new person[5];
		personArr[0] = new person("김지민",20,0,0); // information 메서드에 name과 age만 작성했기 때문에
		personArr[1] = new person("한가인",20,0,0);
		personArr[2] = new person("김종민",18,0,0);
		personArr[3] = new person("김종국",35,0,0);
		personArr[4] = new person("서태지",25,0,0);
		
		// 타입 변수명: 배열
		for(person per : personArr) {
			System.out.println(per.information()); // 메서드를 호출하면 name과 age만 출력
			System.out.println("=====");
		}
	}
	
	
}
