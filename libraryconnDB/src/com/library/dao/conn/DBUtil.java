package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static void main(String[] args) {
		DBUtil.getConnection();
	}
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			// 드라이버 접속
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			// DML은 트랜잭션처리 가능
			// 일괄적으로 commit, 일괄적으로 rollback
			conn.setAutoCommit(false);
		} catch (Exception e) {
			System.out.println("라이브러리를 확인해주세요");
			System.out.println(e.getMessage());
		} 
		return conn;
	} // getConnection() 끝
	
	 public static void commit(Connection conn) {
		 try {
			 // null이면 nullpointException 발생
			 if(conn != null && !conn.isClosed()) conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	 public static void rollback(Connection conn) {
		 try {
			 // conn이 null이 아니고 닫히지 않았으면 rollback
			if(conn != null && !conn.isClosed()) conn.rollback();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	 }
	 
	 public static void close(Connection conn, Statement stmt) {
		 try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null & stmt.isClosed()) stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
	 
	 public static void close(Connection conn, Statement stmt, ResultSet rs) {
		 try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null & stmt.isClosed()) stmt.close();
			if(rs != null & rs.isClosed()) rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
}
