package methodEx;

public class calculatorMain {
	public static void main(String[] args) {
		calculator calc = new calculator(); // calc 객체 생성
		calc.powerOn(); // 메서드실행
		// 매개변수의 타입과 갯수가 일치하지 않을 때 오류
		// 이름이 다른 경우
		int res = calc.add(5, 5); // 메서드실행
		System.out.println(res);
//		System.out.println(calc.add(5,5)); 위 코드와 같음. 변수 따로 설정하느냐 안 하느냐 차이
		
		// 1. 배열을 생성 후  매서드의 파라메테로 전달
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("calc.add(numbers): " 
								+ calc.add(numbers));
		
		// 2. 메서드를 실행할 때 배열을 생성
		calc.add(new int[] {1, 2, 3});
		System.out.println("calc.add(new int[] {1, 2, 3}): " 
								+ calc.add(new int[] {1, 2, 3}));
		
		
		System.out.println("calc.addFn(1,2,3,4,5,6,7): "
								+ calc.addFn(1,2,3,4,5,6,7));
		}
}
