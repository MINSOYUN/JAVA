package List실습;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);

	public String getName() {
		String str ="";
		while(true) {
			try {
				str = scan.next();
				// 숫자인 경우 다시 받아올 수 있도록 처리
				try {
					// 숫자로 변환합니다
					Integer.parseInt(str);
					// 숫자로 변환 되면 입력을 다시 받아 올 수 있도록 합니다
					System.out.println("숫자 말고 문자를 입력해주세요!");
					continue;
				} catch (Exception e) {
					
				}
				
				if(str.equalsIgnoreCase("q")) {
					System.err.println("프로그램을 종료합니다");
					System.exit(0);
				} 
				break;
			} catch (Exception e) {
				System.err.println("입력이 잘못되었습니다");
				System.err.println("문자를 입력해주세요");
				continue;
		} 
		} return str;
	} // 메서드 끝
	
	public int getAge() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.err.println("프로그램을 종료합니다");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("입력이 잘못되었습니다.");
				System.err.println("숫자를 입력해주세요");
				continue;
			} 
		} return i;
	}
	
	
	public static void main(String[] args) {
		App app =new App();
		System.out.println("이름을 입력해주세요: ");
		System.out.println("이름: "+app.getName());
		
		System.out.println("나이를 입력해주세요: ");
		System.out.println("나이: "+app.getAge());
	}
	
}
