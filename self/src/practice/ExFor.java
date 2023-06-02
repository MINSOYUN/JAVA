package practice;

public class ExFor {

	public static void main(String[] args) {
		int i =1;
		int sum = 0; // sum 값 초기화
		for(i=1; i<=100;i++) {    // i는 1~100까지 1씩 증가
			System.out.println("i는 "+i+"다");
			sum += i; // sum = sum + i
		}
		System.out.println("sum은 "+ sum+"이다.");  // for값 나오면 총값 출력
	}

}
