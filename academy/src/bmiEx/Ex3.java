package bmiEx;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째수:");
		String strnum1 = scan.next();
		
		System.out.print("두번째수:");
		String strnum2 = scan.next();
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		
		int result = num1+num2;
		System.out.printf("덧셈결과: %d", result);
		
	}

}
