package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{

   @Override
   /**
    * 
    */
   public List<Book> getList() {
      //3. Dao의 추상메서드를 재정의 하자마자 리스트를 만들어주고 리스트를 반환해야함. 
      System.out.println("FileDao.getList() 시작");
      List<Book> list = new ArrayList<>();
      
      /**
       * try() 안에서 생성하는 이유 > 반납할 자원이 있는 경우 안에다가 생성하면 자동으로 close해줌. 
       * 
       * 4. 파일을 읽어서 리스트를 반환 / 문자로 받을거라서 Reader / Writer 사용
       * 5. 예외처리 해주고 bufferedReader로 파일 읽기 
       * 6. readLine()은 string 타입 / 파일로부터 한줄을 읽어들여 null일때까지 반복 / 
       *    즉, null이 아니면 반복문 탈출 (더이상 읽을게 없다)
       */
      try(FileReader fr = new FileReader("bookList.txt");
            BufferedReader br = new BufferedReader(fr);) {
         String str = "";
         while((str = br.readLine()) != null) {
            
            //16. 우리가 메서드로 떼어놓은 걸 불러온다. 또한 makeBook의 반환 타입이 Book이기 때문에 Book으로 받음. 
            Book book = makeBook(str);
            // 17. 리스트 파싱 중 오류가 발생한 건은 제외
            if(book != null) {
            	list.add(book);
            }
            
            
            //10. 읽어오는 파일을 공백을 이용해서 문자열을 잘라 배열로 반환 > split() 사용 > 하지만 오류가 너무 많이 나와서 메서드로 만들어서 빼기
            
            /*
            String[] strArray = str.split(" ");
            
            int no = Integer.parseInt(strArray[0]);
            String title = strArray[1];
            String author = strArray[2];
            boolean isRent = Boolean.parseBoolean(strArray[3]);
            
            System.out.println(str);
         */
         }
            
      } catch (FileNotFoundException e) {
         System.err.println(e.getMessage());
      } catch (IOException e1) {
         System.err.println(e1.getMessage());
      }
      return list;
   }
   
   
   
   // 11. 하지만 오류가 너무 많이 나와서 메서드로 만들어서 빼고 오류코드들 오류처리하기 (근데 왜 Book 타입으로 받는다궁?) 
   /**
    * 12. 문자열을 책을 만들어줌 
    *     매개변수에 문자열 / 반환타입은 Book
    * @param str
    * @return
    */
   public Book makeBook(String str) {
      //14. book선언 > 반환하기 위해서 ! 
      Book book = null;
      try {
         String[] strArray = str.split(" ");
         
         int no = Integer.parseInt(strArray[0]);
         String title = strArray[1];
         String author = strArray[2];
         boolean isRent = Boolean.parseBoolean(strArray[3]);
         
         //14.
         book = new Book(no, title, author, isRent);

      } catch (Exception e) {
         //13. 내가 한 줄 읽어오는데  파씽이 잘못되어서 오류가 발생할 수 있음 
         //    그렇다면 어떤 것이 오류가 발생인지 알기 위해 
         //즉, 데이터파싱 중 오류가 발생하더라도 프로그램이 종료되지 않도록 try구문을 활용해 오류를 처리 
         System.err.println("리스트 생성 중 오류가 발생하였습니다.");
         System.err.println("========readLine() : "+str);
      }
      //15. 책이 정상적으로 생성되면 book을 반환 / 정상적으로 생성되지 않으면 null을 반환 
      // 예를 들어 try문에서 오류가 발생되어 catch문으로 가게 되면 반환하지 않기 때문에
      return book;
      
   }

   // 16. 오버라이딩
	@Override
	public boolean saveFile(List<Book> list) {
		// 17. 리스트를 파일(bookList.txt)로 저장합니다
		try (FileWriter fw = new FileWriter("bookList.txt");){
			for(Book book: list) {
				// 18. 책의 정보를 공백으로 연결하여 반환
				//     파일로 저장할 때 개행을 해줘야 합니다.
				fw.write(book.toString()+"\n");
			}
			// 19. 파일로 출력 합니다
			fw.flush();
			// 20-1. 파일 출력 성공
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 20-2. 파일 출력 실패
		return false;
	} 

}