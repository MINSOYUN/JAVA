package objectEx;


/**
 * API
 * - API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할수 있게 만든 인터페이스를 뜻한다
 * - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모듬을 말한다
 * - (라이브러리라고 부르기도 한다)
 * @author user
 *
 */
public class ObjectEx {
	public static void main(String[] args) {
		String str = ""; // -> object
		print(str);
		System.out.println("==========");
		
		// 기본타입 -> 메모리에 값 저장
		int num = 0; // int -> Integer(자동형변환) -> object
		// int 타입은 기본타입이므로 Object 타입으로 변환 되지 못합니다
		// int 타입의 객체 형태로 변환 해야합니다
		// -> wrapper 클래스인 Integer 타입으로 자동형변환되어져서 들어간다
		// double -> Double
		// 기본타입: 값 자체를 저장 , 참조타입: 주소를 저장한다 (. 마침표)
		print(num);
		System.out.println("==========");
		
		ObjectEx objEx = new ObjectEx();
		print(objEx);
	}
	
	// 참조타입의 최상위 계층
	// Object 클래스에 toString이 정의 되어 있지만 
	// 메서드의 오버라이딩에 의해서 String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다
	public static void print(Object obj) {
		// toString() 클릭 + F3 -> public String toString() { -> 클래스이름@16진수주소값을 반환
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		// -> apiEx.ObjectEx@58ceff1
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값이 같은지 비교
		// 주소가 같으면 true, 다르면 false
		obj.equals(new Object()); //false
		}
}
