package bmiEx;

public class Exinfo {

	public static void main(String[] args) {
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 ="123", tel3 = "4567";
		
		System.out.println("이름: "+name+"\n나이: "+ age+"\n전화: "+tel1+"-"+tel2+"-"+tel3);
		System.out.print("이름: "+name+"\n나이: "+ age+"\n전화: "+tel1+"-"+tel2+"-"+tel3+"\n");
		System.out.printf("이름: %s\n나이: %d\n전화: %s-%s-%s", name, age, tel1, tel2, tel3);
	}

}
