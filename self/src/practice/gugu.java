package practice;

public class gugu {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
//		int[] gugudan = {2, 3, 5, 7, 9};
//		for(int i : gugudan) {
//			System.out.println("===="+i+"단====");
//			for(j=1;j<=9;j++) {
//				System.out.printf("%s * %s는 %s \n", i, j, (i * j));
//			}
//			System.out.println();
//		}
		
		
		for(i=2; i<=9 ; i+=2) {
			if(i%2==0) {
				continue;
			}
			System.out.println("===="+i+"단====");
			for(j=1;j<=9;j++) {
				System.out.printf("%s * %s는 %s \n", i, j, (i * j));
			}
			System.out.println();
		}
	}

}
