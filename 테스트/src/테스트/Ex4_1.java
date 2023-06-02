package 테스트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4_1 {
	public static void calender() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn = null;
		String sql = "SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS \"날짜\" FROM DUAL";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String date = rs.getString("날짜");
				System.out.println(date);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
