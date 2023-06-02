package practice;

import java.util.Scanner;

public class ExFinish {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		String num1 = "예금액>10000";
		String num2 = "출금액>2000";
		String num3 = "잔고>8000";
		String num4 = "프로그램종료";
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2 출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int choose = scanner.nextInt();
				if(choose==1) {
					System.out.println(num1);
				} else if(choose==2) {
					System.out.println(num1);
				} else if(choose==2) {
					System.out.println(num1);
				} else {
					System.out.println("프로그램 종료");
					break;
				} 
		}
	}

}
