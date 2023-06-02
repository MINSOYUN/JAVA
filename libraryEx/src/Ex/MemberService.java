package Ex;

public class MemberService {
	MemberDao mdao = new MemberDao();
	
	public Member login(String id, String pw) {
		Member member =mdao.login(id, pw);
		if(member != null) {
			System.out.println(member.getName()+"환영합니다");
			return member;
		} else {
			System.out.println("아이디/비밀번호를 잘못 입력하였습니다");
			 return null;
		}
	}
}
