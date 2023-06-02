package 테스트;

public class Ex1 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			if(i%2 == 0) { // 짝수단은 건너뜀
				continue;
			}
			System.out.println("===="+i+"단====");
			for(int j=1; j<=9; j++) {
				System.out.printf("%s * %s는 %s \n", i, j, (i * j));
			}
			System.out.println();
		}
	}

}
