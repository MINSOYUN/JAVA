package extendsEx;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// 부모의 생성자를 호출
		// 매개변수로 입력된 값을 받아서 부모생성자를 호출
		super(name, ssn);
		this.studentNo = studentNo;
	}
	public String toString() {
		return name + ssn + studentNo;
	}
	
	@Override 
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
