package 테스트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() {
		// 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		// 드라이버 로딩
		
		// conn 반환하기 위해 try 밖에서 선언해주기
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 정보를 얻어오는 방법(받을 정보)
			conn = DriverManager.getConnection(url, id, pw);
			// 롤백하지 않고 커넥션이 종료되면 커밋됩니다.
			// 커넥션이 종료될 때 커밋!
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// DriverManager.getConnection 발생할 수 있다
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;
	}
}
