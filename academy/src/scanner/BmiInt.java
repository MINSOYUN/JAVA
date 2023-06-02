package scanner;

import java.util.Scanner;

public class BmiInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해주세요(단위m):");
		double height = scan.nextDouble();
		System.out.printf("당신의 키는 %f 입니다.\n", height);

		System.out.println("몸무게를 입력해주세요(kg):");
		double weight = scan.nextDouble();
		System.out.printf("당신의 몸무게는 %.2f 입니다.\n", weight);
		
	
		double bmi = weight / (height * height);
//		System.out.println("당신의 bmi는 "+bmi+"입니다");
		System.out.printf("당신의 bmi는 %.2f 입니다", bmi);
		
		scan.close();
		
	}
}
