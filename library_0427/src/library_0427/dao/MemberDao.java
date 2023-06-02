package library_0427.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import library_0427.common.ConnectionUtil;
import library_0427.vo.Member;

public class MemberDao {
	public Member login(String id, String pw) {
		// nullpointerException 방지를 위해 처음부터 member를 null로 초기화
		Member member = null;
		String sql = String.format("select id, name, adminYN, status, grade "
				+ "from member where id = '%s' and pw = '%s'", id, pw);
		//System.out.println(sql); // 오류찾기용 문장
		
		System.out.println("id: " + id);
		System.out.println("pw: "+pw);
		
		try (Connection conn= ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			// 질의 결과 결과집합을 member 객체에 담아줍니다
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				String name = rs.getString(2);
				String adminYN = rs.getString(3);
				String status = rs.getString(4);
				String grade = rs.getString(5);
				
				// 비밀번호는 입력하지않는다 -> ""
				member = new Member(id, "", name, adminYN, status, grade);
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return null;
	} // 로그인
	
	public int insertMember(Member member) {
		int res = 0;
		// 오라클에서 기본값 주었으므로 기본 값 없는 것만 입력
		String sql = String.format("insert into member (id, pw, name,adminYN) values"
				+ "('%s','%s','%s','%s')"
				, member.getId(), member.getPw(), member.getName(), member.getAdminyn());
			
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
				res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 회원 추가
	
	public boolean idCheck(String id) {
		boolean res = false; // boolean 타입이기 때문에 작성 되었다
		String sql = String.format("select * from member where id= '%s'", id);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			// true -> rs.next: false -> 결과집합이 없다 -> 해당하는 것이 없다
			// 결과집합이 있으면 true, 없으면 false - 아이디중복
			// 중복되는 id가 있는 것이 좋은것은아니니 false로 반환 하기 위해 ! 작성
			return ! rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// res가 없으면 return false 해도 되는 부분
		return res; // 예외발생했을 때 출력되는 코드
	}
	
	public int deleteMember(String id) {
		int res = 0;
		String sql = String.format("delete from member where id = '%s'", id);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 회원 삭제
}
