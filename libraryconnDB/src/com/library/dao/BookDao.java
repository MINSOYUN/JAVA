package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

/**
 * DB 입출력
 * @author user
 *
 */
// 입출력 list를 만들어 BookVo에 전달
public class BookDao {
	public List<BookVo> getList() {
		List<BookVo> list = new ArrayList<>();
		String sql = "select * from book order by bookNo"; 
		// try(여기에 작성하면) close하지 않아도 된다
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			// 결과를 한줄씩 가져온다. true면 다음 줄 읽어준다
			// while 문장으로 조회가 끝날 때까지 읽어온다
			while(rs.next()) {
				int bookNo = rs.getInt("BookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");
				
				BookVo bookvo = new BookVo(bookNo, title, author, rentYN);
				list.add(bookvo);
			}
		} catch (SQLException e) {
		}
		return list;
	}

	public int insertBook(BookVo bookVo) {
		String sql = "INSERT INTO BOOK VALUES(?,?,?,?)";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo. getTitle());
			pstmt.setString(3, bookVo. getAuthor());
			pstmt.setString(4, bookVo. getRentYN());
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteBook(int bookNo) {
		
		String sql = "delete from book where bookNo="+bookNo;
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();){
			int res = stmt.executeUpdate(sql);
			return res;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return 0;
	}
	
	/**
	 * 대여/반납이 가능한 상태라면 true
	 * 아니면 false
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		String sql = " select * from book where bookno=? and rentYN = ?";
		try{
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public int updateBook(int bookNo, String rentYN) {
		String sql = "update book set rentYN = ? where bookNo =?";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			// ? 의 순서대로 인덱스 번호를 부여합니다
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, bookNo);
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}
	
}
