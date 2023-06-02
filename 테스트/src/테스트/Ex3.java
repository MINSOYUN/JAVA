package 테스트;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BMI를 계산하겠습니다");
		System.out.println("당신의 키를 입력해주세요(단위: m)");
		double height = scan.nextDouble();
		System.out.println("당신의 몸무게를 입력해주세요(단위: kg)");
		double weight = scan.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.printf("당신의 bmi는 %.2f 입니다. 룰루~!", bmi);
	}
}
