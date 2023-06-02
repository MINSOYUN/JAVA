package List실습;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
// 파일 입출력용
public class FileDao implements Dao{
	
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		dao.insertBook(dao.getBooklist());

		List<Book> list = new ArrayList<>();
		list.add(new Book(0,"책1","저자1", false));
		list.add(new Book(1,"책2","저자2", false));
		list.add(new Book(2,"책3","저자3", false));
		dao.insertBook(list);
	}
	
	@Override
	// Book 객체를 담고있는 List를 반환해야하기 때문에 
	public List<Book> getBooklist() {
		System.out.println("책 리스트를 조회 합니다");
		List<Book> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader
				(new FileReader("bookList.txt"));) {
			// 파일 읽어오기
			// null이 될때까지 읽어오기
			String str = "";
			while((str=br.readLine()) != null){
				// 읽어온 데이터 공백으로 자르기 -> 배열 생성
				String[] strArray = str.split(" ");
				
				// 생성자의 타입에 맞게 타입을 변환하여 변수에 저장
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				// 책을 생성하기
				
				// 리스트에 담기
				list.add(new Book(no, title, author, isRent));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 리스트 반환
		return list;
	}

	@Override
	public int insertBook(List<Book> list) {
		// true 매개변수 입력하면 이어쓰기가 됩니다
		// new FileWriter("bookList.txt"))
		try (FileWriter fw = new FileWriter("bookList.txt")) {
			for(Book book: list) {
				fw.write(book.toString()+"\n");
			}
			
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteBook(List<Book> List) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(List<Book> List) {
		// TODO Auto-generated method stub
		return 0;
	}

}
