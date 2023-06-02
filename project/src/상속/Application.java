package 상속;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/* 3명의 학생 정보를 기록할 수 있게 배열 할당
		 * 데이터를 참고하여 3명의 학생 객체 생성 ---> 반복문을 통해 출력
		 * 배열 선언; 같은 타입의 데이터를 여러개 보관
		 */
		// 학생 객체 생성 후 배열에 담기
		Student[] s = new Student[3];
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student num : s) {
			System.out.println(num.information());
		} // for문 끝
		
		System.out.println();
		
		/* 최대 10명의 사원 정보를 기록할 객체 배열 생성
		 * 키보드로 사원 정보를 입력 받도록 구현
		 */
		Employee[] e = new Employee[10];
		e[0] = new Employee("박보검", 28, 180.3, 72.0, 10000000, "영업부");
		e[1] = new Employee("강동원", 40, 182.0, 76.0, 20000000, "기획부");
		
		Scanner scan = new Scanner(System.in);
		int count =2;
		while(true) {
			
			System.out.print("이름을 입력하세요: \n");
			String name = scan.next();
			System.out.print("나이를 입력하세요: \n");
			int age = scan.nextInt();
			System.out.print("키를 입력하세요: \n");
			double height = scan.nextDouble();
			System.out.print("몸무게를 입력하세요: \n");
			double weight = scan.nextDouble();
			System.out.print("급여를 입력하세요: \n");
			int salary = scan.nextInt();
			System.out.print("부서를 입력하세요: \n");
			String dept = scan.next();
			
			// 매개변수 생성자를 이용하여 필드를 초기화
			Employee emp = new Employee(name, age, height, weight, salary, dept);
			e [count] = emp;
			// Employee. e = new ~
			System.out.println(emp.information());
		
		count +=1;
		
		// 반복문탈출
		System.out.println("종료하시려면 n을 입력해주세요");
		String choice = scan.next();
		if(choice.equals("n") || choice.equals("N")) {
		break;
			} 
		} // while문 끝
		
			
	for(Employee emp : e) { 
		if(e ==null){
			break;
		} 
		System.out.println(emp.information());
	}
			
	}
}