package classEx;

public class BoardMain2 {

	public static void main(String[] args) {
		// int[] intArr = {1,2,3,4,5};
		
		int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		// 참조타입 변수명 = new 타입[길이]
		String[] strArr = new String[5];
		
		
		Board[] boardArr = new Board[5];
		boardArr[0] = new Board("게시글1","홍길동"); 
		boardArr[1] = new Board("게시글2","홍길동"); 
		boardArr[2] = new Board("게시글3","홍길동"); 
		boardArr[3] = new Board("게시글4","홍길동"); 
		boardArr[4] = new Board("게시글5","홍길동"); 
		
		for(Board board:boardArr) {
			System.out.println("======");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			System.out.println("======");
		}
	}

}
