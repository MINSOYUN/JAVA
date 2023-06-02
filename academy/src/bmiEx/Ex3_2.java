package bmiEx;

import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = scan.next();
		
		System.out.println("비밀번호: ");
		String pass = scan.next();
		int password = Integer.parseInt(pass);
		
		if(name=="java" && password == 12345) {
			System.out.println("로그인 성공");
		} else if(!(password == 12345)) {
			System.out.println("로그인 실패, 비밀번호 틀림");
		} else if (!(name=="java")){
			System.out.println("로그인 실패, id 틀림");
		}
	}
}


