package bmiEx;
// 한줄(라인)주석 단축키 ctrl + /

/* 
 * 여러줄(범위)주석
 */
 // 새로추가
/**
 *  도큐먼트 주석: java Doc, api 도큐먼트 생성하는데 사용
 * @author user
 *
 */
public class test {
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		System.out.println("테스트"); 	// 콘솔에 출력하는 문장
		
		// 명령문의 끝은 ;(세미콜론)으로 마무리, 없으면 컴파일 오류 발생
		int x;		// int: 정수를 저장할 수 있는 변수 x를 선언
		x=1;		// 변수 x 에 1을 대입, = 대입연산자: 오른쪽에 있는 값을 왼쪽에 대입
		
		int y = 2; // 변수 선언과 동시에 값을 저장
		int result = x + y;
		// 문자와 숫자의 연산 (+)			
		System.out.println("결과:"+result); //더하기로 연결
		
	}
}
