package scanner;

import java.util.Scanner;

public class BmiEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("이름: ");
		String name = scan.next();
//		System.out.println("키: "); 
		double height = scan.nextDouble();
//		System.out.println("몸무게: "); 
		double weight = scan.nextDouble();
		System.out.printf("이름: %s\n키(단위:cm): %.2f\n몸무게(단위:kg): %.2f\n", name, height, weight);
		
		System.out.printf("%s님 안녕하세요~!\n", name);
		double bmi = weight / (height * height);
		System.out.printf("당신의 bmi는 %.2f 입니다.\n", bmi);
		
		System.out.println();
		System.out.println("종료하려면 \"q\" 입력하세요.");
		
		while(true) {
		String str = scan.next();
		if("q".equals(str)) {
			System.out.println("종료합니다");
			break;
			} else
		
		while(true) {
			if(bmi>25) {
				System.out.println("비만입니다");
			} else if(bmi>=23.0) {
				System.out.println("과체중입니다");
			} else if(bmi>=18.5) {
				System.out.println("정상입니다");
			} else {
				System.out.println("저체중입니다");
			} 
			break;
		}
		scan.close();
	}
	}
}
