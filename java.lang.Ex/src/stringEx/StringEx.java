package stringEx;

import java.io.UnsupportedEncodingException;

public class StringEx {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "hello";
		// str 객체가 가지고 있는 값을 byte[] 로 반환
		byte[] byteArry = str.getBytes();
		byte[] byteArry2 = {67, 68, 69};
		
		// byte 배열을 String 문자열로 변환
		// 시작인덱스(l), 출력 갯수(2개 -> l, l)
		String str1 = new String(byteArry,2,2);
		String str2 = new String(byteArry2);
		System.out.println(str1);
		System.out.println(str2);
		
		 // 문자코드가 일치 하지 않는 경우 깨질 수 있습니다.
		 // euc-kr, ms949:  한글 표현시 2바이트 사용
		 // utf-8: 한글 표현시 3바이트 사용
		 String str3 = "아웅 배구파...";
		 byte[] b =str3.getBytes("euc-kr");
		 String s_euckr = new String(b, "euc-kr");
		 System.out.println(s_euckr); // 아웅 배구파...
		 
		 String s = new String(b);
		 System.out.println(s);
	}
}
