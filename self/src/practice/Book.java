package practice;

public class Book {
	private String title;
	private String author;
	private boolean isRent;
	
	Book(){
		
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
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
	
	@Override
	public String toString() {
		String str = "";
		if(isRent == true) {
			str = "대여중";
		} 

		return author+","+title+str;
	}
	

}
