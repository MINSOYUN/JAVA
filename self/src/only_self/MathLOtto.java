package only_self;

public class MathLOtto {

	public static void main(String[] args) {
		// 랜덤으로 1~45까지의 숫자 6개 출력하기
		for(int i=1; i<8; i++) {
			int random = (int)(Math.random()*45+1);
			System.out.println(random);
		}
	}

}
