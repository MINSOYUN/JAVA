package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UncheckedException
 * - RuntimeException을 상속하고 있는 예외들 -> 실행예외
 * - 컴파일시 예외 처리코드가 있는지 검사하지 않는다
 * - 프로그램 실행 도중 문제가 발생되는 것이므로
 *   오류를 예측해서 조건문을 통해 처리 해주어야 한다
 * - 보통 예측 가능한 범주에 속하므로 어느정도 예측하여 처리하는 것이 가능하다 
 * 
 *  RuntimeException의 후손들
 *  - ArrayIndexOutOfBoundsExcaption: 배열의 접근에 잘못된 인덱스 값을 이용한 경우
 *  - NegativeArraySizeException: 배열의 사이즈를 음수로 지정한 경우
 *  - ArithmeticException: 0으로 나눈 경우
 *  - NullPointerException: 참조변수의 값이 null인 경우 주소 접근 연산자를 사용시
 *  - classcastException: 잘못된 Cast 연산자 사용시
 */

//ArrayIndexOutOfBoundsExcaption
//NegativeArraySizeException
//ArithmeticException
//NullPointerException
//classcastException


public class D_UncheckedException {
	
	public static void main(String[] args) {
		D_UncheckedException d = new D_UncheckedException();
//		d.method1();
//		d.method2();
		d.method3();
	}
	
	
	
	public void method1() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("숫자를 입력해주세요!");
				int num = scan.nextInt();
				break;
//				 scanner.nextInt() 문자로 입력한 경우
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str+" 은 입력 불가능합니다");
			}
		} // while 끝
		
		System.out.println("문자를 입력해주세요");
		// nextInt()를 이용햇 숫자값을 받아올 경우
		// 엔터가 그냥 남아있어서 nextLine()이 자동으로 실행
		String str = scan.nextLine(); // 숫자 입력 후 엔터가 nextLine에 입력된다
		int str1 = Integer.parseInt(scan.nextLine());
		
	} // 메서드끝
	
	
	public void method2() {
		int i = 10;
		int j = 0;
		
		try {
			int k=i/j;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} //try 끝
		
	} // 메서드 끝
	
	
	public void method3() {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요!");
		
		try {
			size = scan.nextInt();
		} catch (Exception e) {
			// 숫자가 아닌 문자열을 입력 받았을 때 출력
			System.out.println(scan.next()+"입력 불가능합니다");
			return;
		}
		// 배열의 사이즈를 음수로 설정 -> 오류 발생
		// NegativeArraySizeException 이 발생할 소지가 있으므로
		// 입력된 값이 양수인지 체크합니다.
		if(size<0) {
			System.out.println("음수는 입력할 수 없습니다.");
			return;
		}
		
		// 입력 받은 숫자가 양수일 때, 배열의 길이로 들어간다
		int[] arr = new int[size];
		// 배열의 길이:0 ~ n-1

		try {
			// 방번호는 0부터 시작하므로
			// 배열의 생성 길이는 size보다 1작은 수까지 참조가 가능하다
			// 유효하지 않은 방번호에 접근하려 할 경우
			// ArrayIndexOutOfBoundsExcaption 오류 발생
			// size가 3일때 배열의 길이도 3이므로 arr[3]은 없는 배열의 인덱스
			int num = arr[size];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력하였습니다");
		}
		
	} // 메서드 끝
	
	
}
