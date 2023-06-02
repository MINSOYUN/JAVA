package 객체;

public class Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book(){
		
	}

	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	String information() {
		return getTitle()+" "+getPrice()+" "+getDiscountRate()+" "+getAuthor();
	}
	
	public void calc() {
		System.out.println("도셔명 = "+getTitle());
		int result = (int)(getPrice()-(getPrice()*getDiscountRate()));
		System.out.println("할인된 가격 = "+getPrice()+"원");
	}
	
	
}
