package getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_ex {
	public static void main(String[] args) {
		System.out.println("conn생성");
		getConnection();
		
	}
	// 케넥션타입의 겟커넥션메서드 생성
	public static Connection getConnection() {
		Connection conn = null;
		// DB 접근하기 위해 필요한 정보
		// ip: port: sid
		String url= "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jungang";
		String pw = "1234";
		// 클래스가 잘 로딩되는지 확인
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println(conn);
			Statement stmt = conn.createStatement();
			// 연도-월-일
			ResultSet rs = stmt.executeQuery("SELECT to_char(SYSDATE,'yyyy-mm-dd') FROM DUAL");
			if(rs.next()) {
				String today = rs.getString(1);
				System.out.println("오늘날짜는  :"+today);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}

}
