package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	// 데이터 삽입
	// 정적 멤버이기 때문에 객체 생성 없이도 호출 가능하다
	
	public void insert(int no, String title, String author, String isRent) { // 매개변수의 값을 
		// 넣어주어야 한다.
		// 커넥션닫아줘야하는이유?
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "INSERT INTO BOOK VALUES ("+no+", '"+title+"', '"+author+"', '"+isRent+"')";
			// 삽입, 수정, 삭제
			// 쿼리 입력
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건 처리되었습니다");
			// 자원반납
			// 내가 지금 가지고 있는 conn을 닫는다
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	// 데이터 수정
	public void update(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("update book set isRent = 'Y' WHERE NO = 3");
			System.out.println(res+"건 수정 되었습니다");
		
				// 자원을 반납시키지 않고 5초간 대기
				Thread.sleep(5000);
				DBUtil.closeConnection(conn, stmt);
				System.out.println("자원반납");
				// 자원 반납하면 sql의 세션이 끊어진다
				System.out.println("대기");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 삭제
	public void delete(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "DROP FROM BOOK WHERENO =10";
			int res = stmt.executeUpdate(sql+no);
			System.out.println(res+"처리함");
			DBUtil.closeConnection(conn, stmt);
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
			try {
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				// 질의 결과를 결과집합으로 받기 위해서 executeQuery 사용 -> 닫아주기
				ResultSet rs = stmt.executeQuery("select * from book order by no");
				// 한줄 씩 읽기 / 읽어올 줄이 있다면 true, 없다면 false 반환 -> 여러줄: while 문 사용
				while(rs.next()) {
					int no = rs.getInt(1);
					String title = rs.getString("title"); // 숫자 입력도 가능
					String author = rs.getString(3);
					String isRent = rs.getString(4);
					// java.util로 import 하기
					// regdate 의 타입으로 작성 -> Date
					Date regdate = rs.getDate(5);
					Date editdate = rs.getDate(6);
					
					Book book = new Book(no, title, author, isRent, regdate, editdate);
					list.add(book);
				}
				DBUtil.closeConnection(conn, stmt, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
	
	
	public static void main(String[] args) {
		BookDao dao = new BookDao();
//		dao.insert(15, "헤리포터", "j롤링", "N");
//		dao.delete();
//		dao.update(3);
		List<Book> list = dao.getList();
		System.out.println("=====책 리스트========");
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
	}
}


