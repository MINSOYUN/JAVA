package practice;

import java.util.Scanner;

public class ExBmiSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====BMI를 계산합니다.====");
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		System.out.print("키를 입력하세요(m): ");
		Double height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요(kg): ");
		Double weight = scan.nextDouble();

		int bmi = (int) (weight / ( height * height));  // 하나만 int 타입으로 강제형변환해도 하나가 double 이기 때문에 다시 double로 자동형변환된다.

		System.out.printf("%s님의 bmi는 %.d입니다\n", name, bmi);
		
		/* switch(bmi) {
		case 30:
			System.out.println("고도비만입니다");
			break;
		case 25:
			System.out.println("비만입니다");
			break;
		case 23:
			System.out.println("과체중입니다");
			break;
		case 18:
			System.out.println("정상입니다");
			break;
		default:
			System.out.println("저체중입니다");
			break;
		} */  
	}

}
