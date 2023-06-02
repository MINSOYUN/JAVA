package only_self;

import java.util.Scanner;

public class Order_menu {

	public static void main(String[] args) {
		// 음식주문하기 (메뉴, 가격 필요)
		// 주문할 때 while, if 문 사용
		// 가격에 연산사용
		
		Scanner menu = new Scanner(System.in);
		
		int num1 = 10000;
		int num2 = 5000;
		int num3 = 8000;
		
		
		System.out.print("먹고 싶은 메뉴를 입력하세요(피자, 치킨, 라면): \n");
		String choose = menu.next();
		while(true) {
			if("피자".equals(choose)) {
				System.out.println("선택하신 메뉴는 \"피자\" 입니다");
				System.out.println("가격은 "+(num1+num1)+"입니다");
			} else if("치킨".equals(choose)) {
				System.out.println("선택하신 메뉴는 \"치킨\" 입니다");
				System.out.printf("가격은 %d 입니다\n", num1+num3);
			} else{
				System.out.println("선택하신 메뉴는 \"라면\" 입니다");
				System.out.println("가격은 "+(num3)+"입니다");
			} break;
		}
	}

}
