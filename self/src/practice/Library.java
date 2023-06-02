package practice;

import java.util.ArrayList;
import java.util.List;

public class Library {
	 List<Book> bookArray = new ArrayList<>();
	 
	 Library(){
		 
	 }
	 
	 Library(List<Book> bookArray){
		 this.bookArray = bookArray;
	 }
	 
	 public boolean addBook(String title, String author){
		 Book book = new Book(title, author);
		 book.toString();
		 return bookArray.add(book);
	 }
	 
	 public void removeBook(int index) {
		 Book book = bookArray.remove(index);
	 }
	 
	 public void updateBook(int index) {
		 /*
		  * 책을 불러와서
		  * rent 하고
		  * 책 다시 세팅
		  */
		 Book book = bookArray.get(index);
		 book.setRent(true);
		 bookArray.set(index, book);
	 }

	 @Override
	public String toString() {
		 int i=0;
		 for(Book book :bookArray) {
			 System.out.println(i+": "+book.toString());
			 i++;
		 }
		 return super.toString();
	}

	 public static void main(String[] args) {
		 Library lib = new Library();
		 lib.addBook("집에", "가고싶다");
		 lib.addBook("언제", "갈수있으려나");
		 lib.addBook("머리를", "쓰자");
		 
		 System.out.println("책의 목록");
		 lib.toString();
		 System.out.println();
		 
		 System.out.println("삭제할 책의 번호를 입력하세요");
		 int i=1;
		 lib.removeBook(i);
		 lib.toString();
		 System.out.println();
		 
		 System.out.println("대여할 책의 번호를 입력하세요");
		 lib.updateBook(i);
		 lib.toString();
		 
		 
	}
 
 
 
}
