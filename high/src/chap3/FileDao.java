package chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
public static void main(String[] args) {
	
	try (BufferedReader br = new BufferedReader
			(new FileReader("bookList.txt"));){
		String str ="";
		List<Book> list = new ArrayList<>();
		while((str = br.readLine()) != null) {
			// split: 구분자로 끊어서 배열에 반환해준다
			// 파라미터 구분자를 이용하여 문자열을 자르고 배열로 반환
			// 책을생성 하는데 필요한 값 들을 구분자로 이용
			
			// split 테스트
			String[] strArray = str.split(" ");
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			Boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			list.add(new Book(no, title, author, isRent));
		}
			System.out.println("파일로부터 읽어들인 정보를 출력합니다");
			
			for(Book book : list) {
				System.out.println(book.toString());
			}

		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
	} // 메인메서드 끝
}