package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 1. 필드 전역변수: 클래스 내부 어디에서든 사용 가능하다
	private List<Book> list;
	// 2. FileDao 또는 DatabaseDao 로 생성할 수 있도록 인터페이스를 타입으로 선언
	private Dao dao = new FileDao();
	
	// 3. 생성자 선언
	public Library(){
		// 4. 파일(dao.getList())을 읽어서 리스트를 초기화(생성자) 합니다
		list = dao.getList();
	}
	// 3. 생성자 선언
	public Library(String type){
		if(type.equalsIgnoreCase("DB")) {
//			dao = new Database();
		}
	}
	
	// 4. 오버라이딩 -> App에서 호출
	@Override
	public String toString() {
		String listStr = "";
		for(Book book: list) {
			listStr += book.toString()+"\n";
		}
		return listStr;
	}
	
	// 책을 생성하는 메서드
	public boolean insert(int no, String title, String author, boolean isRent) {
		// 중복체크: getNo가 입력받은 no와 같다면 이미 일련번호가 있는 책
		// -> syso 출력 후 return false 반환
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("중복되는 일련번호가 존재합니다");
				return false;
			}
		}
		// 5-1. 외부로부터 받은 데이터를 바탕으로 책을 생성
		Book book = new Book(no, title, author, isRent);
		// 5-2. 리스트를 파일에 저장, list를 파라미터로
		boolean res = dao.saveFile(list);
		// 6-1. 파일에 성공적으로 저장되면 리스트에 추가
		list.add(book);
		if(res) { // res: dao.saveFile(list)
			return true;
		} else {
			// 6-2. 리스트에 없으면 remove
			list.remove(book);
			return false;
		}
	} // 메서드 끝
}
