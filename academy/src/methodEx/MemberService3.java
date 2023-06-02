package methodEx;

import java.util.Scanner;

public class MemberService3 {
	public String id;
	public String pw;
	
	// 생성자
	public MemberService3(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	// 메서드
	/**
	 * 로그인처리
	 * @param id
	 * @param pw
	 * @return 로그인성공: true, 로그인 실패: false
	 */
	public boolean login(String id, String pw) {
		// 필드 id: this.id / pw: this.pw
		if(id!= null && id.equals(this.id) // id가 null이 아니고 필드의 id값과 동일
				&& pw!=null && pw.equals(this.pw)) { // pw가 null이 아니고 필드의 pw값과 동일
			System.out.println("로그인성공");
			return true;
		} 
		System.out.println("로그인실패");
		return false;
	}
	
	public void logout() {
		System.out.println(id+"님 로그아웃되었습니다"); // 매개변수(지역변수) 없어서 id는 필드의 id
	}
	
	public static void main(String[] args) {
		MemberService3 service  = new MemberService3("홍길동", "1234");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 사용자로부터 id/pw 입력받는다
			System.out.print("id: ");
			String id = scan.next();
			System.out.println();
			System.out.print("pw: ");
			String pw = scan.next();
			// ==================
			
			
			boolean res = service.login(id, pw);
			if(res) {
				System.out.println("환영합니다");
				break;
			} else {
				System.out.println("id/pw가 일치하지 않습니다");
			}
			
		}
			System.out.println("로그아웃 하시려면 q를 입력해주세요");
			String exit = scan.next();
			if("q".equals(exit)) {
				System.out.println("종료");
				System.exit(0);
				
			}
		
	}
}
