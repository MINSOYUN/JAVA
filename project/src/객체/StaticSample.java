package 객체;

public class StaticSample {
	// 접근제한자가 private이므로 직접 접근이 불가능
	// setter, getter 메서드를 이용
	static String value;
	
	// value 값을 모두 대문자로 변경
	// 생성하지 않고 사용하기 위해 static을 붙여 정적 메서드로 만들어준다
	public static void toUpper() {
		// 모두 대문자로 변경 후 저장
		// 반환된 값을 value 값에 저장 (private이라 직접 접근 어려움)
		value = value.toUpperCase();
		
	}
	// value의 전달받은 인덱스 위치의 값을 전달받은 문자로 변경
	public static void setChar(int index, char c) {
		// 입력한 String 문자열을 char[] 로 반환
		// 한글자씩 배열의 방에 저장
		char[] charArr = value.toCharArray();
		// 배열이름[방번호] = 값;
		// 값의 배열의 방번호에 입력 -> 덮어쓰기
		charArr[index] = c;
		
		value = String.valueOf(charArr);
//		System.out.println("char[] 출력=======");
//		for(char charValue : charArr) {
//			System.out.println(charValue);
//		}
	}
	// value의 글자 갯수 리턴
	public static int valueLength() {
		// str.length: 문자열의 길이를 반환
		return value.length();
	}
	// value 값과 전달받은 문자열을 하나로 합쳐서 리턴
	public String valueConcat(String str) {
		// 문자열의 연결하여 반환
//		value.concat(str);
		return value+str;
	}
	
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
}
