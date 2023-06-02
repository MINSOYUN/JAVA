package com.library.vo;

// object에서 비교할 때는 Comparable<타입> -> 메서드로 구현
public class Book implements Comparable<Book>{
	// 책 일련번호
	private int no;
	// 제목
	private String title;
	// 작가
	private String author;
	// 대여여부(true -> 대여중, false -> 대여가능)
	private boolean isRent;
	
	// 책의 정보를 저장 DTO or VO
	@Override
	public String toString() {
		String str = "";
		// isRent가 true이면 str 대여중으로 변경
		if(isRent) {
			str = "대여중";
		}
		// 대여 여부가 rent에 들어가므로 return 값에 isRent도 써준다
		return getNo()+" "+getTitle()
		+" "+getAuthor()+" "+isRent+" "+str;
	}
	
	// 책의 정보를 출력 
	public String info() {
		String str="대여가능";
		if(isRent) {
			str = "대여중";
		} return getNo()+" "+getTitle()+getAuthor()+" "+str;
	}
	
	
	
	// getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	// 생성자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}

	@Override
	public int compareTo(Book o) {
		// 현재 객체의 getNo()와 대상 o의 객체 getNo의 숫자를 비교
		if(this.getNo() > o.getNo()) {
			// 현재 객체의 값이 더 크면 1 반환
			return 1;
		} else {
			// 작으면 -1 반환하여 방 바꾸기
			return -1;
		}
	}
	
}


