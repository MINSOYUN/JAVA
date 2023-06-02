package only_self;
import java.util.Scanner;
public class Price {
	public static void main(String[] args) {
		Scanner price =  new Scanner(System.in);
		
		String mul = "티비"; String mul2 = "노트북"; String mul3 = "에어컨";
		int price1 = 500;
		int price2 = 300;
		int price3 = 150;
		System.out.printf("물건의 값은 %s는 %d원, %s는 %d원, %s는 %d원 입니다\n", mul, price1, mul2, price2, mul3, price3);
		
		System.out.println("구매할 물건을 입력하세요: ");
		String gu1 = price.next();
//		String gu2 = price.next();
		System.out.println("가지고있는 금액을 입력하세요: ");
		int chd = price.nextInt();
		
		
		if(gu1=="티비") {
			System.out.println("구매할물건의값은"+price1+"입니다");
			int Rmx = chd - price1;
		} else if(gu1=="노트북") {
			System.out.println("구매할물건의값은"+price2+"입니다");
			int Rmx = chd - price1;
		} else {
			System.out.println("구매할물건의값은"+price3+"입니다");
			int Rmx = chd - price1;
		}
		
		
//		int Rmx = chd -   //남은금액
//		System.out.printf("남은돈은: % 입니다", Rmx);
		
	}
}
