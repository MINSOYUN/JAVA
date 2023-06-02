package library_0427.vo;

public class Book {
	private int no;  //도서번호
	private String title;  // 도서명
	private String rentyn;  // 도서 대여여부
	private String author;  // 작가
	
	// 도서를 추가할 경우 도서명과 작가명만 알고 있으면 생성 가능
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		// 신규도서이므로 자동으로 N
		this.rentyn = "N";
	}
	
	@Override
	public String toString() {
		String rentYNstr = "대여가능";
		// 도서가 rentYN = Y(대여중)인 경우 대여중으로 표시
		// "Y"가 null일 수도 있기 때문에 equals로 비교
		if("Y".equals(getRentyn())) {
			rentYNstr = "대여중";
		}
		return getNo()
				+" "+getTitle()
				+" "+getAuthor()
				+" "+rentYNstr;
	}
	
	// 생성자
	public Book(int no, String title, String rentyn, String author) {
		super();
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	}
	
	// setter getter 
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
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
