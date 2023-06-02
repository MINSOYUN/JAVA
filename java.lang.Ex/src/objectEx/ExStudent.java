package objectEx;

import java.util.HashMap;

public class ExStudent {
	private String studentNum;
	
	private ExStudent(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ExStudent) {
			ExStudent stu = (ExStudent)obj;
			if(this.studentNum == stu.studentNum) {
				return true;
			}
		}
			return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
	public static void main(String[] args) {
		HashMap<ExStudent, String> hashMap = new HashMap<>();
		hashMap.put(new ExStudent("1"), "95");
		
		String score = hashMap.get(new ExStudent("1"));
		System.out.println("1번 학생의 총점: "+score);
	}
}
