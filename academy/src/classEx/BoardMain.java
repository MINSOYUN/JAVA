package classEx;

public class BoardMain {

	public static void main(String[] args) {
		// 게시글 생성
		Board board1 = new Board("게시글1","너무어려워요", "홍길동", "23-03-22", 10); 
		Board board2 = new Board("게시글2","너무어려워요", "홍길동", "23-03-22", 10); 
		Board board3 = new Board("게시글3","너무어려워요", "홍길동", "23-03-22", 10); 
		Board board4 = new Board("게시글4","너무어려워요", "홍길동", "23-03-22", 10); 
		Board board5 = new Board("게시글5","너무어려워요", "홍길동", "23-03-22", 10); 
	
		
		Board[] boardList = new Board[5];
		
		boardList[0] = new Board("게시글1","너무어려워요", "홍길동", "23-03-22", 10); ;
		boardList[1] = board2;
		boardList[2] = board3;
		boardList[3] = board4;
		boardList[4] = board5;
		
	}
	
	/* 타입[] 변수명 = new 변수명[길이];
	 * 
	 * int[] num = new int[5];
	 * num[0] = 1;
	 * num[1] = 2;
	 * num[2] = 3;
	 * num[3] = 4;
	 * num[4] = 5;
	 * 		
	 */

}
