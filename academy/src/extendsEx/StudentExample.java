package extendsEx;

public class StudentExample {
	StudentExample(){
		
	}
	
	
	public static void main(String[] args) {
		People p = new People("시스타","123456");
		
		Student s = new Student("학생1","주민번호",1);
		System.out.println("학생정보----");
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
		
		System.out.println("s.toString");
		// 패키지 이름을 포함한 패키지와 메모리의 주소 표현
		System.out.println(s.toString());
	
	}



	
}
