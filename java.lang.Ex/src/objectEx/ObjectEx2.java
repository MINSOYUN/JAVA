package objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/** key, value: 타입
		 * HashMap<key, value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기가 된다
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		// 변수명.put(타입값, 타입값);
		// 데이터를 담는 방법
		hashMap.put("점심", "초밥");
		hashMap.put("점심1", "짬뽕");
		hashMap.put("점심", "콩불");
		
		// 데이터를 꺼내는 방법
		String str = hashMap.get("점심");
		System.out.println("두구두구 "+str+"!!");
		System.out.println("점심은? "+hashMap.get("점심1"));
		System.out.println("key값이 없으면? "+hashMap.get("점심2")+"\nnull값이 출력된다.");
		
		
		/**
		 * 1 홍길동
		 * 2 나몰라
		 * 3 나잘난
		 */
		
		System.out.println("====사람 이름 출력해보기====");
		HashMap<String, String> person = new HashMap<String, String>();
		person.put("1", "홍길동");
		person.put("2", "나몰라");
		person.put(new String("3"), "나잘란"); 
		
		System.out.println(person.get("1"));
		System.out.println(person.get("2"));
		System.out.println(person.get(new String("3")));
		
	}
}
