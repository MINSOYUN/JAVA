package Ex;

public class Book {
	private int no;
	private String title;
	private String rentYN;
	private String author;
	
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
	public String getRentYN() {
		return rentYN;
	}
	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book(int no, String title, String rentYN, String author) {
		super();
		this.no = no;
		this.title = title;
		this.rentYN = rentYN;
		this.author = author;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String rentstr = "대여가능";
			if("Y".equals(getRentYN())) {
				rentstr = "대여중";
			}
		return getNo() +" "+ getTitle() +" "+ getAuthor() +" "+rentstr;
	}
}
