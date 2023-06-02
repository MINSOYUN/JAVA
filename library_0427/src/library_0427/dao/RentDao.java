package library_0427.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import library_0427.common.ConnectionUtil;

public class RentDao {
	public static void main(String[] args) {
		RentDao rdao = new RentDao();
		// 조회
		System.out.println(rdao.getrentYN(1));
		// 대여
//		System.out.println(rdao.insert("user", 3));
		// 반납
//		System.out.println(rdao.update(3));
		
		
	}
	/**
	 * 도서가 대출중인지 확인
	 * @param no
	 * @return 대출중: Y
	 * 		   대출가능: N
	 */
	public String getrentYN(int no) {
		String rentYN = "N"; // 기본값을 N으로 주어 N이여도 출력되게 한다
		String sql = String.format("select 대여여부 from 대여 where 도서번호 = %d and 대여여부='Y'", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				rentYN= "Y";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return rentYN;
	}
	
	// 대여
	public int insert(String id, int no) {
		int res = 0;
		// 대여할거니까 대여여부를 Y로 변경하고 대여일에 SYSDATE를 입력한다.
		// 아직 반납을 하지 않았으므로 반납일은 NULL로 설정하고 반납가능일은 대여일+7이므로 SYSDATE+7 작성한다 
		String sql = "INSERT INTO 대여 VALUES(SEQ_대여.NEXTVAL, ?, ?, 'Y', SYSDATE , NULL, SYSDATE+7, NULL)";
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, id);
			pstmt.setInt(2, no);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	}
	
	// 반납
	public int update(int no) {
		int res = 0;
		String sql = "update 대여 set 반납일 = sysdate, 대여여부 = 'N' where 도서번호 = ?";
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, no);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	}
}
