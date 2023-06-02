package bmiEx;

public class printfEx {

	public static void main(String[] args) {
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.62252;
		int money = 10000000;
		
		System.out.println(money);
		System.out.printf("%,d\n", money);
		
		System.out.println("이름:"+name+", 나이:"+age+", 아이디:"+id);
		/* 형식문자열
		 지정한 형식문자열에 맞게 값 또는 변수를 대입할 수 있다
		 %s: 문자열, %d: 정수, %f: 실수
		 자릿수를 정해줄 때 %5d, %-5d, %05d
		 %5d: 왼쪽 빈자리를 공백
		 %-5d: 오른쪽 빈자리를 공백
		 %05d: 빈자리를 0으로 채워줄 때 */
		System.out.printf("이름: %s\n나이: %d\n아이디: %s\n키: %f\n", name, age, id, height);
		System.out.printf("이름: %5s 나이: %5d 키: %10.2f \n", "홍길동", 10, height);
		System.out.printf("이름: %-4s 나이: %-4d 키: %4.1f \n", "홍길동", 8, height);
		System.out.printf("이름: %3s 나이: %03d 키: %010.2f \n", "홍길동", 21, height);
		// %% -> % 출력
		System.out.printf("키: %%%4.6f", 1.6254);
		
	
	}

}
