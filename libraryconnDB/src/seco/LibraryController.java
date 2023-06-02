package seco;

import java.util.Scanner;

public class LibraryController {
	// 스캐너에 static 붙여주기
	public static Scanner scan = new Scanner(System.in);
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	public void start() {
		System.out.println("===");
		System.out.println("도서관");
		System.out.println("===");
		
		while(true) {
			MemberVo memberVo = login();
			bookService.getClass();
			
			if("y".equalsIgnoreCase(memberVo.getAdminYN())){
				
			}
		}
		
	}

	public MemberVo login() {
		while(true) {
			System.out.println("아이디입력");
			String id = getString();
			System.out.println("비번입력");
			String pw = getString();
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				return memberVo;
			}
		}
	}

	public String getString() {
		String str = "";
		str=scan.next();
		if(str.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		return str;
	}
	
	public static int getInt() {
		int i=0;
		while(true) {
			String str =scan.next();
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			i=Integer.parseInt(str);
			return i;
		}
	}
}
