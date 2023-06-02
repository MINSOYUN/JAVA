package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// String을 담는 리스트, 타입 내가 지정한다
		List<String> list = new ArrayList<String>();
		
		// 리스트에 저장
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add("myBATIS");
		list.add(2, "Database"); // 2번인덱스에 저장됨
		
		// 삭제
		list.remove(1); // jdbc 삭제
		
		// 변경
		list.set(2, "oracle");
		
		// 리스트에 저장된 총 갯수
		int size = list.size();
		System.out.println("총 갯수: "+size);
		
		// 리스트에 저장된 객체 얻기
		// 인덱스 0부터 시작한다
		String str = list.get(2);
		System.out.println("2번 인덱스: "+str);
		
		for(int i=0; i<list.size();i++) {
			str = list.get(i);
			System.out.println(i+": "+str);
		} 
		
		int i =0;
		for(String s : list) {
			System.out.println(i+": "+s);
			i++;
		}
		
		
	}
}
