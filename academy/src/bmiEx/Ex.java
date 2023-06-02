package bmiEx;

public class Ex {
	// 168 48 bmi
	public static void main(String[] args) {
		double height = 1.68;
		int weight = 48;
		
		double bmi = weight / (height * height);
		System.out.println("당신의 bmi는 "+bmi+" 입니다");
		
	}

}
