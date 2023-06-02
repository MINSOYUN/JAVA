package 객체;

public class Help {
	public static void main(String[] args) {
		int[] numbers = {5,4,3,2,1};
		// 배열의 값을 정렬하고 싶어요!
		// 방을 바꾸기위해 새로운 변수를 선언하고 이용합니다.
		
		String str = "abcd123";
		String sss ="에엥";
		System.out.println("char: "+str.charAt(2)); // char: c
		// c의 유니코드값 출력
		System.out.println((int)str.charAt(2)); // 99
		// 문자열의 길이를 반환
		System.out.println(str.length()); // 7
		// str.substring(int from, int to): to의 인덱스는 포함x
		System.out.println(str.substring(1,6)); // bcd12
		// 문자열을 하나씩 쪼개어 char 배열에 집어 넣어준다.
		System.out.println(str.toCharArray());
		
		
	}
}
