package List실습;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			String id = scan.next();
			if("admin".equalsIgnoreCase(id)) {
				System.out.println("비밀번호를 입력하세요");
				String pw = scan.next();
				if("12345".equals(pw)) {
					System.out.println("로그인 성공하였습니다");
				} else {
					System.out.println("비밀번호를 다시 입력하세요");
					 // 비밀 번호 다시 받기
				} 
			} else {

			}
			
		}
		
	} // 메인메서드끝
}
