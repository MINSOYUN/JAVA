package methodEx;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService service = new MemberService("홍길동", "12345");  // 생성자 this.id에 홍길동, this.password에 12345
		Scanner scan = new Scanner(System.in); 
		
		int i=0;
		while(true) {
		System.out.println("아이디를 입력해주세요");
		String id = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = scan.next();
		
		boolean res = service.login(id, pw); // 입력받은 id, pw값
		if(res) {
			System.out.println(service.id+"님 환영합니다");
			break;
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다."); // false일 경우 while문 반복
			i++;
			if(i>=5) {
				System.out.println("시스템을 종료합니다.(비밀번호 불일치 5회 초과)");
				System.exit(5); // 5회 이상 초과되었을 때 종료되도록 if문 안에 작성
			}
		}
		
	}
	}
}
