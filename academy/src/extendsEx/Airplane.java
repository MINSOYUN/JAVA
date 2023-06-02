package extendsEx;

// final키워드 클래스 붙였을 때: 부모클래스가 될 수 없음
	public class Airplane{
		public Airplane() {
			System.out.println("====airplane 생성합니다");
		}
		public void land() {
			System.out.println("착륙합니다");
		}
		
		public void fly() {
			System.out.println("일반비행입니다");
		}
		
		public void takeOff() {
			System.out.println("이륙합니다");
		}
	}
