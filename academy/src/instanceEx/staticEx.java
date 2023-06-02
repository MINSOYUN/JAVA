package instanceEx;

public class staticEx {
	
	public static String name; // 인스턴스멤버
	
	public static void main(String[] args) {
		staticEx ex = new staticEx(); // 객체생성 / 객체: 인스턴스 객체 (인스턴스화)
		// static: 정적멤버로 프로그램 시작과 메모리에올라간다
		// 정적 메소드에서 사용할 수 있는 것은 정적인 요소만 가능
		// 사용하려면 필드에 static 붙여줘야 한다
		 System.out.println(name);
	}
}
