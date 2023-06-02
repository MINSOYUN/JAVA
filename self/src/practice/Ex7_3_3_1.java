package practice;

public class Ex7_3_3_1 {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
		
	}
	
	public static void method(Ex7_3_3 servlet) {
		servlet.service();
	}
	
	
}
