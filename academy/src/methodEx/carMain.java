package methodEx;

public class carMain {

	public static void main(String[] args) {
		car Car = new car(10); // gas =10
		Car.run(); 
		
		// 반환타입이 boolean 타입이므로 if 문의 조건에 입력 가능
		if(Car.isLeftGas()) { // run 메서드 실행 후 Car.isLeftGas()는 0 false
			System.out.println("남은 기름의 양: "+Car.gas);
		} else {  
			System.out.println("주유해주세요!!!");
		}
		
		
		Car.run1();
	
	}

}
