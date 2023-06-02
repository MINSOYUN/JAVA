package library_0427.controller;

import java.util.Scanner;

import library_0427.dao.MemberDao;
import library_0427.service.BookService;
import library_0427.service.MemberService;
import library_0427.service.RentService;
import library_0427.vo.Book;
import library_0427.vo.Member;

/**
 * 도서대여 시스템
 * @author user
 * 1. 로그인
 * - 관리자: 도서 등록, 도서 삭제, 사용자 등록, 사용자 삭제
 * - 사용자: 도서 대여, 도서 반납, 도서 대여 현황
 * - controller 주요 역할: 사용자로부터 입력을 받아서 서비스 로직을 효출
 */
public class LibraryController {
	Scanner scan = new Scanner(System.in);
	// 서비스 멤버로 등록
	MemberService memberservice = new MemberService();
	BookService bookservice = new BookService();
	RentService rentsercive = new RentService();
	
	/**
	 * 도서관리 시스템 시작하는 메소드
	 */
	public void library(){
		System.out.println("==================");
		System.out.println("도서관리 시스템 v1.0");
		System.out.println("==================");
		
		// login의 반환 객체가 member이기때문에 Member member
		while(true) {
			Member member = login();
			
			if(member.getAdminyn().equalsIgnoreCase("Y")) {
				// 관리자 메뉴 실행
				adminMenu();
			} else {
				// 사용자 메뉴 실행
				// 로그인한 사용자의 ID를 매개변수로 받는다
				userMenu(member.getId());
			}
		} // while 끝
	} // library 메서드 끝
	
	
	/**
	 * 사용자 메뉴
	 */
	private void userMenu(String id) {
		while(true) {
			// 책 목록 출력
			System.out.println(" ▶도서 목록");
			bookservice.getList();
			System.out.println();
			
			System.out.println(" ▶ 사용자 메뉴");
			System.out.println("================== 메뉴를 선택해주세요 =====================");
			System.out.println("1. 도서 대여 | 2. 도서 반납 | 3. 도서 대여 현황 | 0. 로그아웃 | Q. 종료");
			System.out.println("===========================================================");
			int menu = getInt();
			
			int no = 0;
			switch (menu) {
			case 1:
				System.out.println("대여할 도서의 일련번호를 입력해주세요");
				no = getInt();
				rentsercive.rentBook(no, id);
				break;
			case 2:
				System.out.println("반납할 도서의 일련번호를 입력해주세요");
				no = getInt();
				bookservice.returnBook(no);
				break;
			case 3:
				System.out.println("대여 현황");
				bookservice.getList();
				break;
			case 0:
				System.out.println("로그아웃을 합니다");
				return;
			default:
				break;
			}
		} // while 끝
	}
	
	
	/**
	 * 관리자 메뉴
	 */
	private void adminMenu() {
		while(true) {
			// 도서 목록을 출력
			System.out.println(" ▶도서 목록");
			bookservice.getList();
			System.out.println();
			
			System.out.println(" ▶ 관리자 메뉴");
			System.out.println("================== 메뉴를 선택해주세요 =====================");
			System.out.println("1. 도서등록 | 2. 도서 삭제 | 3. 사용자 등록 | 4. 사용자 삭제 | 0. 로그아웃 | Q. 종료");
			System.out.println("====================================================================");
			int menu = getInt();
			
			switch (menu) {
			case 1:
				// 도서등록
				// 사용자로부터 입력 받기 - 도서명, 작가명
				// controller -> service -> dao -> data 처리
				System.out.println("추가 할 도서명을 입력해주세요");
				String title = getString();
				System.out.println("도서의 작가명을 입력해주세요");
				String author = getString();
				bookservice.insertBook(new Book(title, author));
				break;
			case 2:
				System.out.println("삭제 할 도서의 일련변호를 입력해주세요");
				int no = getInt();
				bookservice.deleteBook(no);
				break;
			case 3:
				System.out.println("등록할 사용자의 정보를 입력해주세요");
				String id = "";
				while(true) {
					System.out.println("id를 입력해주세요");
					id = getString();
					boolean idcheck = memberservice.idCheck(id);
					if(idcheck) {
						break;
					}
				}
				System.out.println("pw를 입력해주세요");
				String pw = getString();
				System.out.println("이름을 입력해주세요");
				String name = getString();
				System.out.println("관리자 계정이면 Y를 입력해주세요");
				String str = getString();
				String adminYN = str.equalsIgnoreCase("Y")?"Y":"N";
				memberservice.insertMember(id, pw, name, adminYN);
				break;
			case 4:
				System.out.println("삭제할 사용자의 id를 입력해주세요");
				String delid = getString();
				memberservice.deleteMember(delid);
				break;
			case 0:
				System.out.println("로그아웃을 합니다");
				return;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다. 확인 후 재입력 해주세요");
				break;
			}
		} // while 끝
	}
	

	// 로그인 메서드
	public Member login() {
		// 로그인 -> 로그인 될 때까지 반복해서 돌아간다
		while(true) {
			System.out.println("<로그인>");
			System.out.println("id를 입력해주세요");
			String id = getString();
			System.out.println("pw를 입력해주세요");
			String pw = getString();
			
			// login 반환타입이 member이기 때문에 member에 저장
			Member member = memberservice.login(id, pw);
			// 로그인 성공 -> 멤버를 반환
			if(member != null) {
				return member;
			} else {
				// else -> 로그인이 되었다 -> member로 반환
				return member;
			}
		} // while 끝
	}
	
	
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환 합니다
	 * 문자가 입력 될 때까지 반복
	 * q, Q 입력되면 종료
	 * @return
	 */
	private String getString(){
		String str = "";
			while(true) {
				str = scan.next();
				if("q".equalsIgnoreCase(str)) {
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				} 
				return str;
			} // while 끝
	} // getString 끝
	
	
	/**
	 * 사용자의 입력을 받아 숫자를 반환 합니다
	 * 숫자가 입력 될 때까지 반복
	 *  q, Q 입력되면 종료
	 * @return
	 */
	private int getInt(){
		int i = 0;
		while(true) {
			try {
				i = scan.nextInt();
				return i;
			} catch (Exception e) {
				String str = scan.next();
				// q이면 정상 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				}
				System.err.println(str+"은 입력 불가능합니다.");
				System.err.println("숫자를 입력해주세요");
			}
		} // while 끝
	} // getint 끝
	
	
	}  
