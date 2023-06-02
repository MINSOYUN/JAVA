package 객체;

public class StaticSampleMain {
	public static void main(String[] args) {
		// 정적 멤버 접근: 클래스명.필드명
		// StaticSample의 value 필드 값을 초기화
		StaticSample.setValue("Java");
		// 직접 접근이 안되므로 get 메서드를 활용하여 필드값을 추출
		System.out.println("value: "+StaticSample.getValue());
		
		//toUpper 메서드 실행 후 value 값 출력
		StaticSample.toUpper();
		System.out.println("대문자로 변경: "+StaticSample.getValue());
		
		// 2번째 인덱스의 값을 j로 변경
		StaticSample.setChar(2, 'j');
		// 인덱스 0부터 시작되므로 3번째 값을 변경
		System.out.println("3번째 값을 j로 변경: "+StaticSample.getValue());
		
		System.out.println("문자열의 길이: "+StaticSample.valueLength());
		System.out.println("문자열 연결: "+StaticSample.value.concat("progamming"));
		
}

}