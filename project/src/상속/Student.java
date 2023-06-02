package 상속;

public class Student extends Person{
	int grade;
	String major;
	
	Student(){
		
	}

	// 초기화: 생성자의 매개변수를 필드에 입력합니다
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// 부모의 생성자를 호출 합니다.
		super(age, height, weight); // 매개변수(age, height, weight)까지 작성해주기
		// super.age; // private 접근제한자라 접근이 불가능합니다
		super.name = name;
		// 부모의 필드를 호출합니다
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String information() {
		return getName()+" "+getAge()+" "+getHeight()+" "+getWeight()+" "+getGrade()+" "+getMajor();
	}
	
}
