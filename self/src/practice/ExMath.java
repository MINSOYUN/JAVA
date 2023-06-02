package practice;

public class ExMath {

	public static void main(String[] args) {
		while(true) {	
			int nun1 =(int)(Math.random()*6)+1;
			int nun2 =(int)(Math.random()*6)+1;
			System.out.println("("+nun1+","+nun2+")");
			if(nun1+nun2==5) {
				System.out.println("두 주사위의 합이 5입니다. 출력을 종료합니다");
			} break;
		}
}
}
