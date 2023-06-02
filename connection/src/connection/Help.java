package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Help {


			
			public void update() {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "orauser";
				String pw = "1234";
				
				try {
					System.out.println("======업데이트=====");
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection(url, id, pw);
					System.out.println("오토커밋 - false 설정");
					conn.setAutoCommit(false);
					
					// sql문을 실행하는데 사용
					Statement stmt = conn.createStatement();
					// executeUpdate 메소드는 sql insert, update, delete 문실행하고 영향 받은 행의 '수'를 반환
					int res = stmt.executeUpdate("UPDATE BOOK SET ISRENT = 'Y' WHERE NO =10");
					System.out.println(res+"건 처리되었습니다");
					conn.rollback();
					System.out.println("롤백 되었습니다");
					
				} catch (Exception e) {
					//Class.forName 라이브러리 준비 안됨
					System.out.println("jdbc 라이브러리를 확인해주세요");
				}
			}
			
			public void delete() {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "orauser";
				String pw = "1234";
				
				try {
					System.out.println("======삭제=====");
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection(url, id, pw);
					System.out.println("오토커밋 - false 설정");
					conn.setAutoCommit(false);

					Statement stmt = conn.createStatement();
					int res = stmt.executeUpdate("delete from book");
					System.out.println(res+"건 처리되었습니다");
					conn.rollback();
					System.out.println("롤백 되었습니다");
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			public void connectioneTest() {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "orauser";
				String pw = "1234";
				
				Connection conn;
				
				try {
					System.out.println("======커넥션=====");
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pw);
					System.out.println("커넥션 얻기 성공 "+conn);
					
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM BOOK");
					rs.next();
					
					System.out.println("조회결과: "+rs.getString(1));
					
				} catch (ClassNotFoundException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			
		} 
		
		
		public void insert() {
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
				System.out.println("======삽입=====");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				
				System.out.println("커넥션 성공? "+conn);
				Statement stmt = conn.createStatement();
				
				// 몇건이 처리되었는지 반환
				// executeUpdate 반환타입 int
				// 오라클에 insert into 작성하고 커밋이나 행 추가하고 rollback 하고 이클립스에 작성
				// 롤백 안하면 테이블에 추가된채로 출력하는 것이기 때문에 무결성제약 오류 뜬다
				
				int res = stmt.executeUpdate("INSERT INTO BOOK VALUES (7, '오늘', '날짜는', 'N', SYSDATE, SYSDATE");
				
				System.out.println(res+"건 처리되었습니다");
				conn.setAutoCommit(false);
				stmt.close();
				conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}

