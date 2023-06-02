package com.library;

public class App {
	public static void main(String[] args) {
		// 1. 기본 생성자로 초기화했으므로 list 불러온다
		Library lib = new Library();
		// 2. object의 toString 오버라이딩
		System.out.println(lib.toString());
		
		System.out.println(lib.insert(8, "너무어렵다", "결과는", false));
		System.out.println("오늘도 우리는 추가 테스트 인생 야호~!");
		System.out.println(lib.toString());
		
	}
}
