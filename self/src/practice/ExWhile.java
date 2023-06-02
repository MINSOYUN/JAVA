package practice;

public class ExWhile {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<=100) {   //i는 0~100
			i++; //1~101
//			++i; //1~101
			System.out.println("i는 "+i+"다");
			sum += i;   //sum값 초기화 했으므로 타입 선언x
		}
		System.out.println(sum);
	}

}
