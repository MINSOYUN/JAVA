package extendsEx;

public class AppliMain {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle()); // 변환 불가능
		// bus가 Vehicle을 상속받아서 구현 되었으므로
		// 자동형변환 될 수 있다
		
		// Vehicle타입을 상속받받아 클래스 형 변환이 가능하다
		// 매개값으로 어떤 자식 객체가 제공되는가에 따라 메소드실행 결과가다양//부모의 메서드가 오버라이팅 된 경우(재작성) 된 경우 자식 메서드를 호출 한다
		driver.drive(new Bus()); // 변환 성공
		driver.drive(new Vehicle());
		
	}
}
