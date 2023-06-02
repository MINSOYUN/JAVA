package practice;

public class Star {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		String sum = "";
		for(i=1;i<=5;i++) {
			for(j=i;j<=i;j++) {
				sum += "*";  // sum = sum + *
				
				System.out.println(sum);
			}
		} 
		
		/* for(int i=1;i<=5;i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		} */
	}
}
