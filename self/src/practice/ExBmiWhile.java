package practice;

import java.util.Scanner;

public class ExBmiWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====BMI를 계산합니다.====");
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		System.out.print("키를 입력하세요(m): ");
		Double height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요(kg): ");
		Double weight = scan.nextDouble();

		double bmi = weight / ( height * height);
		System.out.printf("%s님의 bmi는 %.3f입니다\n", name, bmi);
		
		while(true) {
			if(bmi>30) {
				System.out.println("고도비만입니다");
			} else if(bmi>25) {
				System.out.println("비만입니다");
			} else if(bmi>23) {
				System.out.println("과체중입니다");
			} else if(bmi>18.5) {
				System.out.println("정상입니다");
			} else {
				System.out.println("저체중입니다");
			}
				break;
		}
		System.out.println("====종료합니다====");
	}

}
