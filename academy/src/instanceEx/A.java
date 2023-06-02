package instanceEx;

import limitEx_2.C;

// 클래스 C가 public 이면 A 가 참조가능 ,default~ 참조불가능
public class A {
	// 필드 정의
	// defalut 접근제한자
	C c = new C();

	// 기능 정의
	public void method1() {
		C c = new C();
		c.method1();
//		c.method2();  method2 private이라 접근 제한
		}
	}
