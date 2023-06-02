package seco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	// 로그인 위해 매개변수 설정, 타입은 회원의 정보가 있는 MemberVo
	public MemberVo login(String id, String pw) {
		String sql = "select * from book where id? and pw=?";
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String adminYN = rs.getString("adminYN");
				MemberVo memberVo = new MemberVo(id,pw,name,adminYN);
				return memberVo;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} return null;
	}
	
	public int insertMember(MemberVo memberVo) {
		String sql = "insert into Member values (?,?,?,?)";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			// memberVo의 get으로 접근하기
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} return 0;
	}
	
	public int deleteMember(String id) {
		String sql = "delete from member where id =?";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, id);
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} return 0;
	}
}
