package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileDao implements Dao{

	@Override
	// 정보를 읽어오는 메서드 리드
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);) {
			String str = "";
			while((str=br.readLine()) != null) {
				Book book = makeBook(str);
				if(book != null) {
					list.add(book);
				}
			}
		} catch (Exception e) {
			System.err.println("도서정보스캔불가");
		}
		return list;
	}
	
	// book 도서 정보 저장 -> 도서 배열을 만들어 저장해야함 한줄씩
	private Book makeBook(String str) {
		Book book = null;
		String[] stray = str.split(" ");
		int no = Integer.parseInt(stray[0]);
		String title = stray[1];
		String author = stray[2];
		boolean isRent = Boolean.parseBoolean(stray[3]);
		book = new Book(no, title, author, isRent);
		
		return book;
	}


	@Override
	// 읽은 정보를 파일에 저장 -> writer
	public boolean saveFile(List<Book> list) {
		try(FileWriter fw = new FileWriter("bookList.txt");){
			for(Book book : list) {
				fw.write(book.toString());
				return true;
			}
			fw.flush();
		} catch (Exception e) {
			System.out.println("도서정보저장실패");
		}
		return false;
	}

}
