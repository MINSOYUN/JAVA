package scanner;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 변수이름 = new Scanner(매개변수 System.in)
		System.out.println("키를 입력해주세요: ");
		// 타입 타입변수이름= 변수이름.next; (사용자가 입력한 값을 받아 string으로 반환)
		String height = scan.next();
		System.out.printf("당신의 키는 %s 입니다.", height);
		
		// 몸무게를 입력해주세요:
		// 몸무게를 입력 받고 출력
		System.out.println("\n몸무게를 입력해주세요: ");
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %s 입니다.\n", weight);
		
		double weight2 = Double.parseDouble(weight);
		double height2 = Double.parseDouble(height);
//		double bmi = weight2 / (height2 * height2);
//		System.out.printf("당신의 bmi는 %.2f입니다.", bmi);
		System.out.println("당신의 Bmi는 "+weight2 / (height2 * height2)+"입니다");
		
		// scanner가 사용하고 있던 리소스를 반납
		scan.close();

	}

}
