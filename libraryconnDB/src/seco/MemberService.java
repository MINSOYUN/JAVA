package seco;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo != null) {
			System.out.println(memberVo.getId()+"님 환영합니다");
			return memberVo;
		} else {
			System.out.println("아이디 비밀번호가 일치하지 않습니다");
			return null;
		}
	}
	
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("입력되었습니다");
		} else {
			System.out.println("입력 중 오류가 발생되었습니다");
		}
	}
	
	public void deleteMember(String id) {
		int res = memberDao.deleteMember(id);
		if(res>0) {
			System.out.println("삭제 되었습니다");
		} else {
			System.out.println("삭제 중 오류가 발생되었습니다");
		}
	}
}
