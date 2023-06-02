package mathEx;

public class MathEx {
	public static void main(String[] args) {
		// 절대값
		int i = Math.abs(-5);
		double j = Math.abs(-5.123);
		System.out.println("절대값: "+i);
		System.out.println("절대값: "+j);
		
		// 내림
		System.out.println("내림: "+Math.floor(j));
		// 올림
		System.out.println("올림: "+Math.ceil(j));
		// 반올림
		System.out.println("반올림: "+Math.round(j));
		
		// 최대값
		System.out.println("최대값: "+Math.max(5.3, 2.5));
		// 최소값
		System.out.println("최소값: "+Math.min(4, 9));
		
	}
}
