package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

// 구현체 선언 -> implements
public class FileDao implements Dao{

	@Override
	public List<Book> getList() {
		// 파일로부터 데이터를 읽어서 리스트로 반환 -> 반환타입
		System.out.println("FileDao.getList() 시작");
		// 리스트를 반환 해야하기때문에 List 먼저 선언(List 타입: Book)
		List<Book> list = new ArrayList<>();
		// Reader("파일경로작성") -> 오류 발생 예방 위해 try-catch 사용
		// try (여기에 작성 -> 리소스 자동으로 닫아준다 fr.close();)
		try (FileReader fr = new FileReader("bookList.txt");
				// 한줄씩 읽어오기 위해 BufferedrReader 사용 (단독사용불가) 
				BufferedReader br = new BufferedReader(fr);){
			String str = "";
			// Reader -> while 사용하여 null 값이 아닐 때까지 nextLine으로 한줄씩 읽어오기 반복
			// null 이면 반복문 탈출
			while((str =br.readLine()) != null) {
				// 문자열을 이용해서 Book 객체 생성 -> makeBook 메서드로 빼기(타입 Book)
				Book book = makeBook(str);
				// null일 경우 책이 제대로 생성 x
					if(book != null) {
						// 생성된 객체를 리스트에 담아줍ㄴ다
						list.add(book);
					}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("FileDao.getList() 종료");
		return list;
	} // getList 메서드 끝
	
	/**
	 * 읽어온 문자열을 파싱하여 Book 객체 생성
	 * 1. 배열 생성 2. Book에 저장
	 * @param str
	 * @return
	 */
	private Book makeBook(String str) {
		// 반환 선언 
		Book book = null; 
		// 공백 " " 을 기준으로 배열에 저장 split(String 배열로 받아준다)
		String[] stray = str.split(" ");
		// 강제 변환시 오류가 발생 할 수 있으므로
		
		// 파일이 올바르지 않은 형태로 저장되어 있을 경우 오류가 발생
		// 프로그램에서 오류가 발생했을 때 비정상적으로 종료되는 것을 방지하기 위해 예외처리 try catch
		try {
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt(stray[0]);
			String title = stray[1];
			String author = stray[2];
			// 문자열을 boolean 타입으로 변환
			boolean isRent = Boolean.parseBoolean(stray[3]);
			book = new Book(no, title, author, isRent);
			// try catch 문이 없으면 마지막에 return 작성하기
			return book;
		} catch (Exception e) {
			// 문자열 파싱 중 오류가 발생했을 경우 메세지 처리
			// & return null (파싱불가!)
			System.err.println(str+": 파싱 중 오류가 발생 하였습니다");
			return null;
		}
	}

	@Override
	public boolean ListToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");){
			// list를 매개변수로 받고 있으므로 받은 list에서 하나씩 꺼내와
			// Book 타입의 book으로 받아온다
			for(Book book : list) {
				// book의 toString까지 호출해야 book 의 정보를 가져온다
				// 개행문자로 책 정보마다 한줄 띄어쓰기
				fw.write(book.toString()+"\n");
			}
			// flush(); 버퍼에 있는 정보 출력
			fw.flush();
			// 책의 정보가 제대로 저장되면 true 반환
			return true;
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		// 책 정보 제대로 저장 안되면 false 반환
		return false;
	}
	
	// ===========================================================
	@Override
	public int delete(int no) {
		
		return 0;
	}

	@Override
	public int update(int no) {
		int res = 0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate("update book set isRent = 'Y' WHERE NO = 7"+no);
			System.out.println(res+"건 수정 완료 크~");
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
