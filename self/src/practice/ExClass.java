package practice;

public class ExClass {
	int x ;
	int y ;
	
	
	void num() {
		System.out.println("리턴x매개변수x");
	}
	void num2(int x, int y) {
		System.out.println("리턴x매개변수o");
		System.out.println(x+y);
	}
	
	String num3() {
		System.out.println("리턴o매개변수x");
		return "에베베";
	}
	int num4(int x, int y) {
		System.out.println("리턴o매개변수o");
		System.out.println(x+y);
		return 0;
	}
	
	boolean ggo(int x) {
		if(x>3) {
			return true;
		} return false;
	}
	
	
	public static void main(String[] args) {
		ExClass go = new ExClass();
//		System.out.println(go.num());
//		System.out.println(go.num2(4, 8));
//		System.out.println(go.num3());
//		System.out.println(go.num4(7, 2));
		
		go.num();
		go.num2(3, 4);
		go.num3();
		// syso안에 메서드넣으면 리턴값도 출력됨
		// 그냥 메서드 호출하면 리턴값 안나옴
		go.num4(5, 3);
		
		boolean let = go.ggo(5);
		if(let) {
			System.out.println("트루");
		} else{
			System.out.println("폴스");
		}
		
		
	}
	
	
}
