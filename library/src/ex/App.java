package ex;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.toString();
		
		lib.insert(1, "엥", "어ㅣ으", false);
		lib.toString();
		
		lib.rentBook(1);
		lib.toString();
	}
	
	
}
