package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcEx {
	
	// F3 -> public interface Connection 인터페이스!
	public static void main(String[] args) {
		
		JdbcEx ex = new JdbcEx();
		ex.connectioneTest();
		ex.insert();
		ex.delete();
		ex.update();
	}
		
		public void update() {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "orauser";
			String pw = "1234";
			
			try {
				System.out.println("======업데이트=====");
				// 드라이버 로딩
				// 드라이버 클래스를 로드 드라이버 클래스는 해당 데이터베이스의 JDBC 드라이버를 제공.
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// DB 연결 설정 - 데이터베이스에 연결
				// connection: 인터페이스는 데이터베이스와의 연결을 나타낸다
				//드라이버메니저.겟코넥션 메서드 사용하여 데이터베이스에 대한 연결을 설정
				Connection conn = DriverManager.getConnection(url, id, pw);
				// 쿼리 실행 객체 생성
				System.out.println("오토커밋 - false 설정");
				// 쿼리 실행
				conn.setAutoCommit(false);
				// 결과 출력
				
				// sql문을 실행하는데 사용
				Statement stmt = conn.createStatement();
				// executeUpdate 메소드는 sql insert, update, delete 문실행하고 영향 받은 행의 '수'를 반환
				int res = stmt.executeUpdate("UPDATE BOOK SET ISRENT = 'Y' WHERE NO =10");
				System.out.println(res+"건 처리되었습니다");
				conn.rollback();
				System.out.println("롤백 되었습니다");
				
			} catch (Exception e) {
				//Class.forName 라이브러리 준비 안됨
				System.out.println("jdbc 라이브러리를 확인해주세요");
			}
		}
		
		public void delete() {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "orauser";
			String pw = "1234";
			
			try {
				System.out.println("======삭제=====");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection(url, id, pw);
				System.out.println("오토커밋 - false 설정");
				conn.setAutoCommit(false);

				Statement stmt = conn.createStatement();
				int res = stmt.executeUpdate("delete from book");
				System.out.println(res+"건 처리되었습니다");
				conn.rollback();
				System.out.println("롤백 되었습니다");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void connectioneTest() {
			// 데이터 베이스 접근 시 필요한 정보
			// jdbc: oracle: thin: @ ip: 포트: sid
			// ip, port, sid, 계정 정보, 비밀번호 만 수정 가능
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "orauser";
			String pw = "1234";
			
			// Connection 클래스의 인스턴스를 생성
			Connection conn;
			
			try {
				System.out.println("======커넥션=====");
				// 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 커넥션 얻기
				// 드라이버매니저부터 겟커넥션해서 얻고 (접속정보);
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("커넥션 얻기 성공 "+conn);
				// 쿼리 실행하기 위해서  필요한 객체
				Statement stmt = conn.createStatement();
				
				// 데이터 조회
				// executeQuery(쿼리문장 입력) -> 질의 결과를 ResultSet(결과집합으로 돌려준다)으로 반환
				// ResultSet : 결과 집합 // 받고 싶은 결과 ("안에 작성하기"), 세미콜론 붙이지말기
				// count 는 칼럼이 아니다, count의 정보를 담아온다는의미로 컬럼위치에 작성된다
				// 쿼리 작성, 결과집합 받아오기 위해 EXECUTEQUERY 사용 - RESULTSET 반환
				ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM BOOK");
				// 데이터 생성, 수정, 삭제
				// 결과 읽어오기
				// 첫번째 행은 칼럼이기 때문에 next를 통해 값을 호출할 수 있도록 NEXT() 사용하여 한 줄 띄기
				// <기초문법> 오라클 SQL 참고
				// NEXT() BOOLEAN 타입, 다음 줄 읽어올 게 있으면 TRUE, 아니면 FALSE -> 받아올 때까지 반복
				rs.next();
				// 집합 방법1. 컬럼명 순서. getString(숫자) -> 조회된 숫자대로 출력 ex) 1 no, 2 title, 3 author etc
				// 집합 방법2. 컬럼명 넣어주기 ex) no, title, author
				// getSting -> 문자열로 조회, getInt -> 숫자로 변환
				// count(*) 작성해도 된다
				System.out.println("조회결과: "+rs.getString(1));
				
				// 값을 읽어왔으면 connetctionclose
				// stmt.executeupdate("");
				
				// Class.forName 예외
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				
				// DriverManager.getConnection 예외
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	} 
	
	
	public void insert() {
		// 클래스 로딩
		// 커넥션 얻어오기
		// 쿼리 실행객체 생성
		// 쿼리 실행 후 결과집합 받아오기
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		// C 대문자로 작성하기
		Connection conn;
		
		try {
			System.out.println("======삽입=====");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("커넥션 성공? "+conn);
			Statement stmt = conn.createStatement();
			
			// 몇건이 처리되었는지 반환
			// executeUpdate 반환타입 int
			// 오라클에 insert into 작성하고 커밋이나 행 추가하고 rollback 하고 이클립스에 작성
			// 롤백 안하면 테이블에 추가된채로 출력하는 것이기 때문에 무결성제약 오류 뜬다
			
			int res = stmt.executeUpdate("INSERT INTO BOOK VALUES (7, '오늘', '날짜는', 'N', SYSDATE, SYSDATE");
			
			System.out.println(res+"건 처리되었습니다");
			conn.setAutoCommit(false);
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
