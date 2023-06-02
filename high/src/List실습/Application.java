package List실습;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Application app = new Application();
		// file로 작업하겠다 -> library 생성자
		Library lib = new Library("file");
		
		while(true) {
			// 로그아웃 처리 시 다시 실행
			// 로그인 처리
			System.out.println("아이디를 입력해주세요");
			String id = app.getString();
			if("admin".equalsIgnoreCase(id)) {
				// 관리자
				// 도서 목록 출력
				Outter:
				while(true) {
					lib.info();
					
					System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃| q.프로그램 종료");
					int menu = app.getInt();
					switch (menu) {
					case 1:
						// 도서등록
						System.out.println("등록할 도서의 정보를 입력해주세요");
						
						System.out.println("책의 번호를 입력해주세요");
						int no = app.scan.nextInt();
//						int no2 = app.getInt();
						System.out.println("책의 제목을 입력해주세요");
						String title = app.scan.next();
						System.out.println("책의 작가를 입력해주세요");
						String author = app.scan.next();
						
						lib.insertBook(no, title, author, false);
						
						
					case 2:
						// 도서삭제
						System.out.println("삭제할 도서의 번호를 입력해주세요");
						int removeIndex = app.getInt();
						lib.removeBook(removeIndex);
						break;
						
					case 0:
						// 로그아웃
						System.out.println("로그아웃하겠습니다");
						
						
					} // switch 끝
					
				} // while 끝
				
			} else {

			
		}
		
		// 사용자
		// 메뉴별로 작업 수행
		while(true) {
			
			// 도서관 생성
			lib.info();
			
			// 메뉴확인
			System.out.println("1. 도서대여 | 2. 도서반납 | 0. 로그아웃 | q.프로그램 종료");
			System.out.println("메뉴를 입력해주세요");
			
			// 메뉴 숫자 받아오기
			int menu =app.getInt();
			
			if(menu == 1) {
				System.out.println("반납할도서입력해주세요");
				int index = app.getInt();
				lib.rentBook(index);
				
			} else if(menu == 2) {
				System.out.println("도서번호를 입력해주세요");
				int index = app.getInt();
				lib.returnBook(index);
				
			} else if(menu == 0) {
				System.out.println("로그아웃합니다");
				break;
			} else {
				System.err.println("메뉴를 확인해주세요");
			}
		} // while끝
	}
		 // main 메서드
		
	}
	
	/**
	 * 사용자로부터 숫자를 입력받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다");
				System.err.println("숫자를 입력해주세요");
				continue;
			}
			
		} // while 끝
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = scan.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
			} 
		} return res;
		
		
	}
}
