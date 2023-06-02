package Ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MemberDao {
	// 회원정보조회 // 회원 추가 // 회원삭제// 아이디중복
	
	public Member login(String id, String pw) {
		Member member = null;
		String sql = String.format("select * from member where id = '%s' and pw = '%s'", id, pw);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString(3);
				String admin = rs.getString(4);
				String status = rs.getString(5);
				String grade = rs.getString(6);
				
				member = new Member(id, pw, name, admin, status, grade);
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return member;
	} // 회원정보 조회
	
	public int insertmem(Member member) {
		int res = 0;
		String sql = String.format("insert into member(id,pw,name) values('%s','%s','%s')"
				, member.getId(), member.getPw(), member.getName());
		try (Connection conn = ConnectionUtil. getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} return 0;
	} // 회원정보 추가
	
	public int deletemem(String id) {
		int res = 0;
		String sql = String.format("delete from member where id = '%s'", id);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} return 0;
	} // 회원정보 삭제
	
	public boolean idcheck(String id) {
		String sql = String.format("select * from member where id = '%s'", id);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			ResultSet rs = stmt.executeQuery(sql);
			return !rs.next();
		} catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return false;
	} // id 중복검사
}
