package methodEx;

public class loginEx {
	public static void main(String[] args) {
		login MemberService = new login();
		
		boolean info = MemberService.login("hong", "12345");
		if(info) {
			System.out.println("로그인성공했습니다");
		} else {
			System.out.println("로그인 비밀번호 일치x");
		}
			
		/* if(MemberService.login("홍길동", "12345")) {
			System.out.println("환영~~");
		} else {
			System.out.println("아이디 비밀번호일치x");
		} */
		
		
	
	}
}
