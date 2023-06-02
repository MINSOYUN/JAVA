package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;


/**
 * 사용자의 요청을 입력 받습니다
 * 요청에 맞는 서비스 로직을 호출합니다
 * @author user
 *
 */
// 사용자의 요청을 받는 클래스
public class LibraryController {
	
	public static Scanner scan = new Scanner(System.in);
	
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	
	public void start() {
		System.out.println("============");
		System.out.println("도서관에 오신걸 환영 합니다");
		System.out.println("============");
		
		while(true) {
			// 로그인 요청
			MemberVo memberVo = login();
			// 도서목록 출력
			bookService.getList();
			
			
			if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				// 관리자메뉴
				adminMenu();
			} else {
				// 사용자 계정
				userMenu();
			}
			
		}
	}
	
	public void adminMenu() {
		outter:
		while(true) {
			System.out.println("=====관리자메뉴=====");
			System.out.println("1. 도서등록 | 2. 도서삭제 | 3. 사용자등록 | 4. 사용자삭제 | 0. 이전메뉴 | q. 종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
			
			// 일련번호
			int bookNo = 0;
			String id = "";
			
			switch (menu) {
			case 1:
				// 도서등록
				System.out.println("도서 일련번호를 입력해주세요");
				bookNo = getInt();
				System.out.println("도서명을 입력해주세요");
				String title = getString();
				System.out.println("작가를 입력해주세요");
				String author = getString();
				
				bookService.insertBook(new BookVo(bookNo, title, author,"N"));
				break;
			case 2:
				// 도서삭제
				System.out.println("삭제할 도서의 일련번호를 입력해주세요");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				break;
			case 3:
				// 사용자등록
				System.out.println("아이디를 입력해주세요");
				id = getString();
				System.out.println("비밀번호를 입력해주세요");
				String pw = getString();
				System.out.println("이름을 입력해주세요");
				String name = getString();
				System.out.println("관리자 계정은 Y를 입력해주세요");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("Y")?"Y":"N";
						
				MemberVo membervo = new MemberVo(id,pw,name, adminYN);
				memberService.insertMember(membervo);
				
				// 방식 2가지 insert 오류
//				insertMember(id,pw,name);
				
				break;
			case 4:
				// 사용자 삭제
				System.out.println("삭제할 id를 입력 해주세요");
				id = getString();
				memberService.deleteMember(id);
				break;
			case 0:
				
				break;
				
			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요");
				break;
			}
			
		} // adminMenu 끝
			
		}
	
	public void userMenu() {
		while(true) {
		System.out.println("======사용자메뉴=====");
		System.out.println("1. 도서대여 | 2. 도서반납 | 0. 이전메뉴 | q. 종료");
		int menu = getInt();
		int bookNo = 0;
		switch (menu) {
		case 1:
			// 도서대여
			System.out.println("대여 할 도서의 일련번호를 입력해주세요");
			bookNo = getInt();
			bookService.rentBook(bookNo);
			break;
		case 2:
			// 도서반납
			System.out.println("반납할 도서의 일련번호를 입력해주세요");
			bookNo = getInt();
			bookService.returnBook(bookNo);
			break;
		case 0:
			
			return;

		default:
			System.out.println("메뉴 확인 후 다시 선택해주세요");
			break;
		}
	}
	}
	
	/**
	 * 로그인
	 * ID/Pw를 입력 받아서 사용자 정보를 조회 합니다
	 * 로그인 성공할 때까지 반복
	 * @return
	 */
	public MemberVo login() {
		while(true) {
			System.out.println("아이디를 입력해주세요");
			String id = getString();
			System.out.println("비밀번호를 입력해주세요");
			String pw = getString();
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				// 로그인 성공
				return memberVo;
			}
		}
	}
	

	public static String getString() {
		String str = "";
		str = scan.next();
		// q, Q가 입력되면 종료
		if(str.equals("q")) {
			System.exit(0);
		}
		return str;
	}
	
	public static int getInt() {
		int i = 0;
		//  값을 입력받았을때까지 반복
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("숫자 입력 중 오류가 발생 했습니다");
			}
			
		} // while 끝
	}
}
