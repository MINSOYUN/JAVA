package instanceEx;

public class SingletonEx {
	// 2. 자신의 객체 생성해 초기화, 싱글톤 객체가 유일하므로 객체 생성은 필드에
	private static SingletonEx singleton = new SingletonEx(); //
	
	// 1. 생성자를  private 접근제한자를 이용하여 
	// 생성자를 외부에서 이용하지 못하도록 막는다
	private SingletonEx() {
	 
	}
	
	// 3. 외부에서 접근 할 수 있는 메서드를 만들고 생성된 객체를 반환한다
	// - 메인메서드에서 객체를 생성을 할 수 없으므로 정적 메서드로 만들어야 한다
	// - 정적 필드에 자신을 생성하여 리턴해준다 -> 싱글톤 리턴
	public static SingletonEx getInstance() {
		// 정적 메서드에서는 정적 필드, 정적 메서드만 사용이 가능하다
		return singleton;
	}
	
	
	public static void main(String[] args) {
		
		//  클래스명.메서듬() -> 정적 메서드 호출
		// public static SingletonEx getInstance() { return singleton;} 싱글톤 리턴
		SingletonEx ex = SingletonEx.getInstance();
		SingletonEx ex1 = SingletonEx.getInstance();
		
		// 같은 주소를 갖고 있는지 확인
		if(ex == ex1) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
	}
	
}
