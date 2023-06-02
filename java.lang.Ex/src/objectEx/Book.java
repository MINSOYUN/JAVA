package objectEx;

// DAO
// 데이터를 담는 그릇
// 
public class Book {
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	// setter getter 
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
	
}
