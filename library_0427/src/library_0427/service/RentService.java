package library_0427.service;

import library_0427.dao.RentDao;

public class RentService {
	RentDao dao = new RentDao();
	
	public String getRentYN(int no) {
		String rentYN = dao.getrentYN(no);
		return rentYN;
	}
	
	/**
	 * 대여 테이블에 데이터를 입력 합니다
	 * @param id: 도서번호
	 * @param no: 아이디
	 */
	public void rentBook(int no, String id) {
		String rentYN = dao.getrentYN(no);
		if("Y".equals(rentYN)) {
			System.err.println("이미 대여중인 도서입니다");
			return;
		}
		int res = dao.insert(id, no);
		if(res>0) {
			System.out.println(res+"건 대여 되었습니다");
		} else {
			System.out.println("대여 중 문제가 발생하였습니다");
		}
	}
	
	/**
	 * 도서반납
	 * 반납일과 대여여부를 업데이트합니다
	 * @param no
	 */
	public void returnBook(int no) {
		// 반납 가능 여부 체크
		String rentYN = dao.getrentYN(no);
		if("N".equals(rentYN)) {
			System.err.println("이미 반납한 도서입니다");
			return;
		}
		int res = dao.update(no);
			System.out.println(res+"건 반납되었습니다");
	}
	
}
