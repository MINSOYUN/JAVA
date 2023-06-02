package array;

public class ArrayEx13 {
	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		
		// 향상된 for문을 이용해서 출력해보세요!!!!!
		// for (타입 변수명 : 배열){}
		int sum =0;
		for(int point : scores) {
			sum += point;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / scores.length);
		
	}
}
