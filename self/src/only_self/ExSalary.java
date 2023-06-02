package only_self;

import java.util.Scanner;

public class ExSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		Out:
		while(true) {
		System.out.println("입력할 항목의 숫자를 입력하세요: ");
		System.out.println("1. 월급 | 2. 위험수당 | 3. 건강보험료 | 4. 식대 | 5. 실수령액");
		System.out.println("===========");
		int input = scan.nextInt();
		
		switch (input) {
		case 1:
			System.out.print("월급을 입력하세요> ");
			money += scan.nextInt();
			System.out.println("월급은 "+money+"입니다");
			break;
			
		case 2:
			System.out.print("위험수당을 입력하세요> ");
			int money2 = scan.nextInt();
				System.out.println("수령액은 "+(money+=money2)+"입니다");
			break;
			
		case 3:
			System.out.print("건강보험료를 입력하세요> ");
			int money3 =scan.nextInt();
			System.out.println("수령액은 "+(money -= money3)+"입니다");
			break;
			
		case 4:
			System.out.print("식대를 입력하세요> ");
			int money4 = scan.nextInt();
			System.out.println("수령액은 "+(money -= money4)+"입니다");
			break;
			
		case 5:
			System.out.println("실수령액은 "+money+"입니다");
			break Out;

		}
	} 
		
		
		
	}

}
