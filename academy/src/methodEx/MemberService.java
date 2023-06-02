package methodEx;

public class MemberService {
	String id;
	String password;
	
	public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		} return false;
	}
	void logout(String id) {
		System.out.println("로그아웃되었습니다");
	}
}
