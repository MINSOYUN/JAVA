package classEx;

public class CalculatorMain {

	public static void main(String[] args) {
		// calculator 객체를 생성 후 주소값을 반환
		Calculator calc = new Calculator();
		
		System.out.println("=======");
		System.out.println(calc.name);
		
		System.out.println();
		calc.name ="실수계산기";
		System.out.println(calc.name);
		// .: 주소접근연산자
		// 값만 넣어주기
		
		// 재사용할 때는 변수에 담아줍니다.
		System.out.println();
		int addRes = calc.add(5, 7);
		System.out.println(addRes);
	}

}
