package practice;

public class ExFor3 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i=0; i<=100; i++) {
			if(i%3==0) {
				sum += i; // sum = sum + i / i=3일 때 sum=3, i가 6일때 sum = 3+6
			}
		}
		System.out.println(sum);
	}
}
