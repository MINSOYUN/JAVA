package instanceEx;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		// 싱글톤 방식으로 구현
		Calendar cal = Calendar.getInstance();
		// 현재 日을 출력
		int day = cal.get(Calendar.DATE); // Calendar.DATE = 5;
		int day1 = cal.get(5);
		
		System.out.println(cal.get(Calendar.YEAR)+"년"); 
		System.out.println(cal.get(Calendar.MONTH)+"월"); 
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)+"일째");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		// 실행전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		
	}
}
