package stringEx;

public class StringEx1 {
	public static void main(String[] args) {
		// 7번째 인덱스의 문자가 1, 3이면 남자, 2, 4면 여자
		String ssn = "123456-2234567";
		
		// charAt(7)
		// 해당인덱스의 문자를 char 타입으로 반환
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
			System.out.println("남자");
		} else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4'){
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다");
		}
		
	}
}
