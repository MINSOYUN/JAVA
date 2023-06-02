package bmi;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// 스캐너 객체를 사용하기 위해 생성합니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("====BMI====");
		System.out.print("키를 입력해주세요(m): ");
		double height = scan.nextDouble();
		System.out.print("몸무게를 입력해주세요(kg): ");
		double weight = scan.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.printf("당신의 bmi는 %.2f 입니다.\n", bmi);
		/* BMI가	18.5 이하면 저체중 
			18.5 ~ 22.9 사이면 정상
			23.0 ~ 24.9 사이면 과체중
			25.0 이상부터는 비만으로 판정. */
			
		while(true) {
			if(bmi<18.5) {
				System.out.println("저체중");
			} else if(bmi<=22.9) {
				System.out.println("정상");
			} else if(bmi<=24.96) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}
			System.out.println("q: 종료, 아무키나 입력해주세요");
			// string의 비교는 .equals()
			String str = scan.next();
			if("q".equals(str)); {
				// 반복문탈출
				break;
			} 
				
			}
		System.out.println("=====");
		}

	
	}
