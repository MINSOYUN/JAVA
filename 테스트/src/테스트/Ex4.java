package 테스트;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex4 {
	public static void calender() {
		String sql = "SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS \"날짜\" FROM DUAL";
		
		try(Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String date = rs.getString("날짜");
				System.out.println(date);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Ex4.calender();
	}
}

