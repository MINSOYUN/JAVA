package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
// java.util 로 추가
import java.util.Date;
import java.util.List;

public class JdbcEx2 {
	public static void main(String[] args) {
		
		JdbcEx2 ex = new JdbcEx2();
		ex.getList();
		
	}
		public void getList() {
			// 클래스 로딩
			// 커넥션 얻어오기
			// 쿼리 실행객체 생성
			// 쿼리 실행 후 결과집합 받아오기
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "orauser";
			String pw = "1234";
			
			// C 대문자로 작성하기
			Connection conn;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				
				System.out.println("커넥션 성공? "+conn);
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK ORDER BY NO ASC");
				
				List<Book> list = new ArrayList<>();
				
				while(rs.next()) {
					int no = rs.getInt(1);
					String title = rs.getString(2);
					String author = rs.getString(3);
					String isRent = rs.getString(4);
					Date regdate = rs.getDate(5);
					Date editDate = rs.getDate(6);
					
					Book book = new Book(no, title, author, isRent, regdate, editDate);
					// add 가 가지고 있는 갯수만큼 ,로 연결
					list.add(book);
				}
				// [] 대괄호로 묶어 도서 정보 출력
				System.out.println(list);
				// 책마다 한줄 띄어져서 출력함
				for(Book book : list) {
					System.out.println(book.toString());
				}
				
				// 사용한 거 다 닫아주기
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // 메서드 끝
	
}
