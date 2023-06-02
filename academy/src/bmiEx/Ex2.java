package bmiEx;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		String name = info.next();
		int number = info.nextInt();
		String tell1 = info.next();
		String tell2 = info.next();
		String tell3 = info.next();
	
		System.out.printf("1.이름: %s\n", name);
		System.out.printf("2.주민번호 앞 6자리: %d\n", number);
		System.out.printf("3.전화번호: %s-%s-%s\n", tell1, tell2, tell3);
	
		info.close();
	}

}
