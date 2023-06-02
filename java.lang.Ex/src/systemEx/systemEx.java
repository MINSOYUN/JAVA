package systemEx;


public class systemEx {
	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기
		
		// 시작시간 구하기, 타입 Long       // 1/1000초를 구합니다
		long startTime = System.currentTimeMillis();
		
		
//		System.in
//		System.out
		int sum = 0; // 초기화
		// 할 때 마다 5초씩 대기
		for(int i=0; i<5; i++) {
			sum+=i;
			if(i==4) {
				// JVM 강제 종료
				System.exit(0);
			}
			Thread.sleep(1000);
		}
		System.out.println("총 합계: "+sum);
		// 끝난 시간
		long endTime = System.currentTimeMillis();
		
		// 계산 시 1000으로 나누기
		System.out.println((endTime - startTime) / 1000+"초 소요되었습니다");
	}
}
