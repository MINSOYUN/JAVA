package Ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public List<Book> getlist(){
		List<Book> list = new ArrayList<>();
		String sql = "select * from book order by no";
		try (	Connection conn =  ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}
		} catch (SQLException e) {
			System.out.println("도서조회오류");
			e.printStackTrace();
		} return list;
	} // 도서 조회
	
	public int insert(Book book) {
		int res = 0;
		String sql = String.format("insert into book values(SEQ_BOOK_NO.NEXTVAL,'%s','%s','%s')"
				, book.getTitle(),book.getRentYN(),book.getAuthor());
		try (Connection conn =  ConnectionUtil.getConnection();
			Statement stmt =  conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 도서 추가
	
	public int delete(int no) {
		int res = 0;
		String sql = String.format("delete from book where no = %d", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 도서 삭제
	
	public int update(int no, String rentYN) {
		int res = 0;
		String sql = String.format("update book set rentYN= '%s' where no = %d", rentYN, no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} return res;
	} // 대여여부 업데이트
	
}
