package ex;

import java.util.List;

// 도서 정보 추가 삭제 등
public class Library {
	private List<Book> list;
	private Dao dao = new FileDao();
	
	Library(){
		list = dao.getList();
	}
	
	@Override
	// 모든 정보를 출력
	// book 정보를 저장할 String 변수 필요
	public String toString() {
		String sts = "";
		for(Book book : list) {
			sts += book.toString()+"\n";
		}
		return sts;
	}
	
	public boolean insert(int no, String title, String author, boolean isRent) {
		// 검증
		for(Book book : list) {
			if(book.getNo() == no) {
				System.out.println("도서정보추가불가");
				return false;
			} 
		}
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		// book이 들어간 list를 saveFile에 저장 -> 타입 파일
		boolean res = dao.saveFile(list);
		if(res) {
			System.out.println("도서정보저장성공");
			return true;
		} else {
			System.out.println("도서정보저장실패");
			list.remove(book);
			return false;
		}
	}
	
	// 대여로 해야한다 isrent boolean타입
	public boolean rentBook(int no){
		for(Book book : list) {
			if(book.getNo() == no) {
				return true;
			}
		} return false;
	}
}
