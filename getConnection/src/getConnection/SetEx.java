package getConnection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 컬렉션프레임워크
		// 데이터를 효율적으로 관리(추가, 삭제, 검색, 저장)할 수 있는 자료구조
		// List: 인덱스로 관리
		// Set: 중복 허용하지 않음
		// Map: key,value
		
		// 숫자 원하면 <Integer> -> int아닌이유 오브젝트타입이기 때문에 integer만 가능
		Set lotto = new HashSet<>();
		
		while(lotto.size()<6) {
			int i = (int)(Math.random() * 45)+1;
			lotto.add(i);
			System.out.println("추출:"+i);
			System.out.println(lotto.toString());
		}
		
		/*
		 * 컬렉션에서 요소를 제어 하는 기능
		 * next(), previous()를 사용하여 앞뒤로 이동이 가능
		 * hasNext()를 사용하여 다음 요소가 있는지 확인 하는 기능
		 */
		Iterator i = lotto.iterator();
		while(i.hasNext()) {  // 다음요소가 있니 먼저 물어보는 hasNext()
			System.out.println(i.next()+ " "); // next -> 다음요소 가지고와
			
		}
	}
}
