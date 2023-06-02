package library_0427.service;

import library_0427.dao.MemberDao;
import library_0427.vo.Member;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회 합니다.
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		Member member = memberDao.login(id, pw);
		if(member != null) {
			System.out.println(member.getName() + "님 환영합니다.");
			return member;
		} else {
			System.err.println("아이디/비밀번호가 일치 하지 않거나 없는 계정입니다.");
			return null;
		}
	}
	
	public void insertMember(String id, String pw, String name, String adminYN) {
			Member member = new Member(id, pw, name,adminYN, null, null);
			int res = memberDao.insertMember(member);
			if(res>0) {
				System.out.println(res+"건 추가되었습니다");
			} else {
				System.err.println("회원 추가 중 문제가 발생하였습니다");
				System.err.println("관리자에게 문의해주세요");
			}
	}

	public void deleteMember(String delid) {
		int res = memberDao.deleteMember(delid);
		if(res>0) {
			System.out.println(res+"건 삭제되었습니다");
		} else {
			System.err.println("도서 삭제 중 문제가 발생하였습니다");
			System.err.println("관리자에게 문의해주세요");
		}
	}

	public boolean idCheck(String id) {
		boolean idcheck = memberDao.idCheck(id);
		if(idcheck) {
			return true;
		}
		return false;
	}
	
}