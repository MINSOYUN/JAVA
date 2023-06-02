package bmiEx;

public class BmiEx {

	public static void main(String[] args) {
		// 키 1.6m 몸무게 55kg
		// 몸무게 / 키 * 키
		// 변수의타입 변수명 = 값; 
		// = 대입연산자: 오른쪽에 있는 값을 왼쪽의 변수에 저장
		double height = 1.6;
		int w = 55;
		// 정수와 실수의 연산
		// 정수 55가 실수 55.0으로 자동형변환 되어짐
		double bmi = w / (height * height);
		
		System.out.println("환영합니다");
		System.out.printf("당신의 bmi는 %.1f\t입니다.", bmi);
		
	}

}
