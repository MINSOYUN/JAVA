package Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 생성 하여 반환 합니다
 * @author MSY
 *
 */
public class ConnectionUtil {
	/**
	 * DB Connection 반환
	 * @return Connection
	 */
	public static Connection getConnection() {
	// 접속 정보(ip, port, sid, 계정id, 비밀번호)
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "LIBRARY";
			String pw = "1234";
			
			Connection conn = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 지정한 매개변수로 데이터에 접근
				conn = DriverManager.getConnection(url,id,pw);
				// 트랜잭션 처리를 위해 자동커밋을 false로 설정
				// -> 커넥션이 종료 되는 시점에 커밋
				conn.setAutoCommit(false);
				//System.out.println(conn);
				//System.out.println("프로그램 종료");
				
			} catch (SQLException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.err.println("라이브러리를 확인해주세요");
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return conn;
	}
	
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	// 각각의 메서드가 받는 매개변수가 다르기 때문에 conn, stmt, rs 나눠서 작성
	public static void close(Connection conn) { 
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("connn.close() 실패");
			e.printStackTrace();
		}
	}
	
	// 커넥션만 받아 닫음
	public static void close(Connection conn, Statement stmt) { 
		try { // nullpointerexception 발생 가능성 있다 -> != null
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) { 
		try { // nullpointerexception 발생 가능성 있다
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close() 실패");
			e.printStackTrace();
		}
	}
	
	// 예제를 보여주기 위해 메인 메서드에서 직접 데이터베이스에 연결하는 코드
	public static void main(String[] args) {
		// 접속 정보(ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "LIBRARY";
		String pw = "1234";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 지정한 매개변수로 데이터에 접근
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println(conn);
			System.out.println("프로그램 종료");
			
			// 커넥션 닫기 => 자원 반납
			if(!conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	} // 메인메서드 끝
	
}
