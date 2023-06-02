package library_0427.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import library_0427.common.ConnectionUtil;
import library_0427.vo.Book;

public class BookDao {
	// 도서정보조회
	public List<Book> getList(){
		List list = new ArrayList<Book>();
		
		String sql = "SELECT NO, TITLE "
				+ "    , NVL((SELECT 대여여부 FROM 대여 WHERE 도서번호 = NO AND 대여여부='Y'),'N') RENTYN  "
				+ "    , AUTHOR "
				+ "FROM BOOK "
				+ "ORDER BY NO ";
		// try(리소스생성) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery: resultSet
				// stmt.executeUpdate: int (몇건이 처리되었는지!!)
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insert(Book book) {
		int res = 0;
		String sql = String.format("INSERT INTO BOOK VALUES(SEQ_BOOK_NO.NEXTVAL,'%S','%S','%S')"
				, book.getTitle(), book.getRentyn(), book.getAuthor());
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement()){
			res =stmt.executeUpdate(sql);
			} catch (SQLException e) {
			
			e.printStackTrace();
		} return res;
	} // 도서 삽입
	
	public int delete(int no) {
		int res = 0;
		String sql = String.format("delete from book where no= %d", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 도서 삭제
	
	public int update(int no, String rentYN) {
		int res = 0;
		String sql = String.format("update book set rentYN ='%s' where no=%d",rentYN, no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 대여 상태 수정

	public String getRentYN(int no) {
		String rentYN = "";
		String sql = String.format("select rentYN from book where rentYN = '%s'", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			ResultSet rs =stmt.executeQuery(sql);
			// 조호된 행이 있는지 확인
			if(rs.next()) {
				// DB에 조회된 값을 변수에 저장
				rentYN = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rentYN;
	} // 대여 가능 여부

}
