package methodEx;

public class login {
	
	// 접근제한자 반환타입 메서드명(매개변수타입 매개변수명) { }
	public boolean login(String id, String password) {
		// id에 null이 들어올 경우 nullpointException이 발생할 우려가 있다
		// null이 아닌 경우 체크로직을 실행하거나 "hong"(문자열).equals를 사용
		
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		} else {
			return false; 
	
		}
	}		
	public void logout(String id) {
			System.out.println("로그아웃 되었습니다");
	  
	}
}
