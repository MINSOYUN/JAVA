package limitEx_2;

public class C {
	// 생성자 접근 제한
//	private C(){
		
//	}
	public C(){
		
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
	}
	private void method2() {
		System.out.println("method2");
	}
//	B b = new B();
	
	
	
	
}
