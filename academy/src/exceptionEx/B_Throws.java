package exceptionEx;

import java.io.IOException;

public class B_Throws {
	public static void main(String[] args) {
		B_Throws b = new B_Throws();
		b.method2();
	}
	
	public void method1() throws Exception {
		System.out.println("method1() 호출");
		// 1~3까지 수를 추출
		int num = (int)(Math.random()*3+1);
		if(num == 1){
			throw new Exception();
		} else if(num == 2) {
			throw new IOException();
		} else if(num == 3 ) {
			throw new IOException(); //널포인터익셉션오류
		}
	}
	public void method2() {
		System.out.println("method2() 호출");
		try {
			method1();// 어떤 종류의 예외가 발생 했는지 확인 후 처리
		} //catch(NullPointerException e) {
//			  System.out.println("NullPointerException 오류 발생"); 
//		}
		catch (IOException e){
			// Exception은 예외의 최상이 계층이므로 어떤 오류가 발생했는지 명확하게 알 수 없다
			System.out.println("파일 입력 도중 오류가 발생했습니다");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다");
		} System.out.println("method2() 종료");
	}
	public void method3() {
		
	}
}
