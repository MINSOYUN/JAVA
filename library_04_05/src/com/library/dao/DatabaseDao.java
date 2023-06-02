package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DatabaseDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			// ResultSet 으로 받아오기
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				// DB에선 Y, N
				// (조건)? 참일때 반환값: 거짓일 때 반환값
				String isRentstr = rs.getString("isRent");
				boolean isRent = ("Y".equals(isRentstr))? true: false;
				rs.getDate("regdate");
				rs.getDate("editdate");
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
			
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean ListToFile(List<Book> list) {
		
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
