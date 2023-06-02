package stringEx;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "자바프로그래밍";
		String ssn = "123456789123";
		
		// 매개값의 문자열을 
		// 포함 하고 있으면: 해당 시작! 인덱스 값을 반환
		// 불포함: '-1' 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		
		
		// substring과 함께 사용 될 수 있다
		System.out.println(str.substring(str.indexOf("프로")));
		// 원하는 문자열을 추출
		System.out.println(ssn.substring(0, 6)); // 앞자리만 추출
		System.out.println(ssn.substring(6)); // 시작인덱스만 입력하면 끝까지 출력된다
		
		
		if(str.indexOf("자바")>=0) {
			System.out.println("자바 관련 책!");
		} else {
			System.out.println("자바와 관련 없음");
		} // indexOf 끝
		
		
		// 문자의 길이를 반환 합니다.
		// id의 길이는 5자 이상 이여야 합니다
		String id = "id";
		if(id.length()<5) {
			System.out.println("아이디는 5자리 이상, 14자리 이하로 작성 가능합니다");
		} 
		
		if(ssn.length()!=13) {
			System.out.println("주민등록 번호를 정확히 입력해주세요!");
		} // length 끝
		
		
		// 문자교체
		str = "자바는 객체지향 언어 입니다. 자바를 자바봅시다";
		System.out.println(str.replace("자바", "java")); // replace
		
		
		// 대소문자 교체
		str = "Java Program Language";
		System.out.println("대문자로 변경: "+str.toUpperCase());
		System.out.println("소문자로 변경: "+str.toLowerCase()); // toLowerCase 끝
		
		
		
		// 대소문자 구분하지 않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		
		// 공백을 제거해주기
		id ="    id";
		System.out.println(id); // 공백 제거 x
		System.out.println(id.trim()); // 공백 제거 함 trim 끝
		
		
		// 기본 타입을 문자로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(true));
		
		
	} // 메인메서드끝
}
