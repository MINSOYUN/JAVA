package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// 숫자를 받아 옵니다.
		Scanner scan = new Scanner(System.in);
		
		double height;
		double weight;
		// 사용자가 숫자를 입력할 때까지 반복
		while(true) {
			try {
				System.out.println("키를 입력해주세요(m)");
				 height = scan.nextDouble();
				 // 유효범위를 초과한 경우 오류
				 if(height>3) {
					 System.err.println("키는 3m를 넘을 수 없습니다!");
					 continue;
				 }
				break;
			} catch (InputMismatchException e) {
				String s = scan.next();
				System.err.println(s+"는 입력할 수 없는 값입니다");
			} 
		} // while 끝
		
		// 숫자를 받아올때까지 반복
		while(true) {
			try {
				System.out.println("몸무게를 입력해주세요(kg)");
			    weight = scan.nextDouble();
			    // 사용자의 입력값 범위를 체크
			    if(weight>200 || weight<30) {
			    	System.out.println("");
			    	 continue;
			    }
				break;
			} catch (InputMismatchException e) {
				String s = scan.next();
				System.err.println(s+"는 입력할 수 없는 값입니다");
			} 
		} // while 끝
		System.out.println("키: "+height);
		System.out.println("몸무게:"+weight);
		
		double bmi = weight / (height * height);
		System.out.printf("bmi는 %.3f 입니다", bmi);
	}
}
