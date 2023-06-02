package bmi;

import java.util.Scanner;

/* public: 접근제한자 class(설계도), 클래스이름 {
 * - 필드: 속성을 정의
 * - 메서드: 기능을 정의
 * 		* 메인메서드: 프로그램 시작, 실행을 담당
 * - 생성자: 객체가 생성될 때 실행이 되는 메서드
 * 		* new를 만나면 생성자를 통해서 객체가 생성이 된다	
 * }
 */
public class BmiEx {
	
	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명 = new 타입(매개변수); 
		// 기본 변수는 메모리에 값을 가지고 있다
		// 참조 변수는 메모리의 주소값을 가지고 있다
		Scanner scanner = new Scanner(System.in); // 스캐너 객체가 가지고있는 생성자를 생성
		
		while(true) {
			System.out.println("BMI를 구해드립니다");
			System.out.println("키를 입력해주세요(m) 숫자만 입력 가능합니다");
			double height = scanner.nextDouble(); // 메서드
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height * height);
			System.out.printf("당신의 bmi는 %.2f 입니다\n", bmi);
			
			// 변수 = (조건식 )?참:거짓
			// 삼항연산자
			String bmiRes = (bmi<=18.5)?"저체중":(bmi<=22.9)?"정상":(bmi<=24.9)?"과체중":"비만";
			System.out.println(bmiRes+"입니다");
			
			System.out.println("종료: q, 계속: 아무키나 입력해주세요");
			String exit = scanner.next();
			
			if(exit.equals("q")) {
				// 반복문 탈출
				break;
		}
		
		scanner.close(); 
		
	}
		System.out.println("프로그램이 종료되었습니다");
	}
}
