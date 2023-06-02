package practice;

public class StarG {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=2*i-1; j++) {
				if(j==1 || j==2*i-1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
			}
			} System.out.println();
		}
	}

}
/*
1 1"
  2"
  3*
  4"
  5 "


2 1 " i=j 2i-
  2 *
  3 *
  4 *
  5 "
 
3 1"  j의 갯수: 2n-1개
  2* 1과 2n-1 같을때
  3*
  4*
  5*
  6*
  7"
*/