package methodEx;

public class CalculMain {

	public static void main(String[] args) {
		calcul calc = new calcul(); // 객체 생성
		// 정사각형의넓이
	  calc.areaRectangle(0);
	  double rectangle = calc.areaRectangle(10); // 타입 변수 = 참조변수.메서드(매개변수);
	  System.out.println("정사각형의 넓이 "+rectangle);
	  
	  // 직사각형의 넓이
	  System.out.println(calc.areaRectangle(10, 20)); // 변수 선언안하고 syso에 메서드 작성
	}

}
