package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	// 스캐너 필드로 빼서 App 내에서 자유롭게 이용 가능하게 한다
	static Scanner scan = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
	  // ===============================
		Library lib = new Library("DB");
		// main static 정적메서드에서는 인스턴스필드 사용할 수 없어 생성하고 사용해야 한다
		// 또는 getString과 getInt를 정적멤버로 만들어준다
	
		// 로그인
		// id를 입력 받아서 admin이 관리자, 아니면 사용자
		// admin - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		while(true) {
			System.out.println("id를 입력해주세요");
			String id = getString(); 
			
			if(id.equalsIgnoreCase("admin")){
				System.out.println("관리자메뉴입니다");
				
				Outter:
				while(true) {
					System.out.println("메뉴를 입력해주세요");
					System.out.println();
					System.out.println("1. 도서등록 | 2. 도서삭제 | 0. 로그아웃 | q. 종료");
					int menu = getInt();
					int no=0;
					// q는 getInt가 문자열을 걸러주고 있기 때문에 case에 작성할 필요가 없다
					switch (menu) {
					case 1:
						System.out.println("도서 일련번호를 입력해주세요");
						no = getInt();
						System.out.println("도서명을 입력해주세요");
						String title = getString();
						System.out.println("작가명을 입력해주세요");
						String author = getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println("삭제할 도서의 일련번호를 입력해주세요");
						no = getInt();
						lib.deleteBook(no);
						break;
					case 0:
						System.out.println("로그아웃하겠습니다");
						break Outter;
					default:
						System.out.println(menu+"은 없는 메뉴입니다");
						break;
					} // switch 끝
					
				} // while끝
			} else {
				System.out.println(id+"님 환영합니다! 할루~!");
				System.out.println();
				int no =0;
				
				End:
				while(true) {
					System.out.println("메뉴를 입력해주세요");
					System.out.println();
					System.out.println("1. 도서대여 | 2. 도서반납 | 0. 로그아웃 | q. 종료");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("대여할 도서의 일련번호를 입력해주세요");
						no = getInt();
						lib.rentBook(no);
						break;
					case 2:
						System.out.println("반납할 도서의 일련번호를 입력해주세요");
						no = getInt();
						lib.returnBook(no);
						break;
					case 0:
						System.out.println("로그아웃하겠습니다");
						break End;
						
					default:
						System.out.println(menu+"은 없는 메뉴입니다");
						break;
					}
				} // 메뉴 while 끝
			} // else 끝
			
		} // 큰 while 끝
		
		
//		// 책 추가
//		lib.insertBook(1, "불편한편의점", "나가사키", true);
//		lib.insertBook(2, "혼자공", "신용권", true);
//		
//		// 아래와 같은 식 toString 작성 안해도된다 System.out.println(lib.toString());
//		System.out.println(lib);
//
//		// 책 삭제 -> 일련번호 매개변수로 넣어주기
//		// App 에서 먼저 작성 -> Library에 생성 해준다
//		boolean res =lib.deleteBook(1);
//		
//		// 책 대여
//		res = lib.rentBook(2);
//		res = lib.returnBook(2);
//		
	} // 메인메서드 끝
	
	
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환합니다
	 * 숫자가 입력될 경우 다시 입력을 요청
	 * q나 Q가 입력될 경우 프로그램 종료
	 * @return
	 */
	// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해집니다.
	public static String getString(){
		// try catch문 쓰기 위해 str = ""; 로 먼저 선언
		String str = "";
		// 숫자를 받았을 경우 다시 입력 받기위해 while 문 사용
		while(true) {
			try {
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				// 숫자로 변환 시 숫자로 변경되면 문자를 입력해달라고 다시 요청
				// ex) 문자 -> catch문으로 가서 반복문 탈출 -> str 반환
				// ex) 숫자 -> 변환 됐으므로 syso 실행 -> while 다시 돌아가 재입력
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				// 문자가 입력된 경우 문자를 반환
				// 반복문 탈출
				break;
			}
		}
			return str;
	} // getString 끝
	
	/**
	 * 사용자로부터 정수를 입력 받아 반환합니다
	 * 문자가 입력 되었을 경우 다시 입력 받습니다
	 * q나 Q가 입력되었을 경우 프로그램 종료
	 * @return
	 */
	public static int getInt() {
		// 종료시 q를 받아야 하기 때문에 String 타입으로 먼저 받기
		String str = "";
		// 타입변환 할 int 먼저 선언
		int num=0;
		// 숫자를 입력할 때까지 while 반복
		while(true) {
			// 오류 발생해도 프로그램 종료 막기 위해 try-catch
			try {
				// 문자 입력받기
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				// 숫자로 변환하기 & break;
				num = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				// 숫자로 변환이 되지 않으면 catch 문 작성 
				System.err.println("숫자를 입력해주세요");
			} 
		}
		return num;
	} // getInt 끝
	
}
