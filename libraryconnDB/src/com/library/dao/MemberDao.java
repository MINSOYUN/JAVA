package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.dao.conn.DBUtil;
import com.library.vo.MemberVo;

public class MemberDao {
	public MemberVo login(String id, String pw) {
		// 매개변수를 ?로 입력
		String sql = "select * from MEMBER where id = ? and pw = ?";
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		try (Connection conn = DBUtil.getConnection();
				// prepareStatement 생성할 때 argument sql 삽입
				PreparedStatement pstmt = conn.prepareStatement(sql);)
				{
				// 첫번째 물음표에 무슨값을 넣을래 (물음표순서, 입력원하는 값)
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				// stmt는 쿼리 sql을 executeQuery에 삽입
				// pstmt는 쿼리를 prepareStatement에 삽입
				ResultSet rs = pstmt.executeQuery();
				
				// id와 pw는 위에서 받아왔으므로 if문 안에서는 받지 않는다
				if(rs.next()) {
					
					String name = rs.getString(3);
					String adminYN = rs.getString(4);
					
					MemberVo membervo = new MemberVo(id,pw,name,adminYN);
					return membervo;
				
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// id, pw가 일치하는 사용자를 찾을 수 없습니다
		return null;
	}
	
	public int insertMember(MemberVo memberVo) {
		String sql = "insert into member values (?,?,?,?)";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN().toUpperCase());
			
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		return 0;
}
	
	/**
	 * 데이터베이스에 등록된 사용자 정보를 삭제합니다
	 * Statement
	 * - 쿼리 자체를 String 문자열로 넣어주기 때문에
	 * 문자가 값으로 들어가는 경우 '' 처리를 해줘야 합니다
	 * 
	 * 
	 * PreparedStatement
	 * - Statement 클래스보다 기능이 향상된 클래스
	 * - 코드의 안정성과 가독성이 높다
	 * - 인자 값으로 전달이 가능
	 * - 매개변수를 ?로 설정(?에 ''처리 하지 않습니다)
	 *      setString(index, 값);
	 *      setInt(index, 값);
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {
		String sql = "delete from member where id=?";
		try(Connection conn = DBUtil.getConnection();) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}