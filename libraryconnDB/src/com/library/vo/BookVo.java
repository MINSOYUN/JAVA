package com.library.vo;

public class BookVo {
	int bookNo;
	String author;
	String title;
	String rentYN;
	
	@Override
	public String toString() {
		String str = getRentYN().equals("Y")?"대여중":"";
		return getBookNo()+" "+getTitle()+" "+getAuthor()+" "+str;
	}
	
	public BookVo(int bookNo, String author, String title, String rentYN) {
		this.bookNo = bookNo;
		this.author = author;
		this.title = title;
		this.rentYN = rentYN;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}
	
	
}
