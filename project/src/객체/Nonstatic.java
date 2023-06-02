package 객체;

public class Nonstatic {
	// 1~45까지의 임의의 정수 6개(중복x) 출력
	public void printLottoNumbers() {
		// 6개 수를 저장할 배열을 생성
		int[] lotto = new int[6];
		// i: 0~5
		for(int i=0; i<lotto.length; i++) {
			// 0<= random <1
			// 1<= random <46  /  1~45
			// double 타입이므로 int로 형변환
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 중복체크
			// 동일한 숫자가 입력되었는지 체크
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			} // 2. for문 끝
		} // 1. for문 끝
		
		// 방을 바꿀 때 필요한 공간을 생성
		int tmp = 0;
		// 순서대로 정렬하기
		for(int i=0;i<lotto.length; i++) {
			// 오름차순 / 내림차순
			// 전 방은 비교할 필요가 없으므로 j는 i와 같게 초기화
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]){
					tmp = lotto[i];
					lotto[i] = lotto[j];
					// 큰 수를 뒤로 이동
					lotto[j] = tmp;
				}
			} // 방바꾸기
		}
		
		// 반복문을 활용하여 배열을 출력
		System.out.println("lotto Number");
		for(int num: lotto) {
			System.out.print(num + " ");
		} System.out.println();
	}
	
	// 전달받은 문자를 전달받은 숫자만큼 출력
	public void outputChar(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		} System.out.println();
	}
	
	// 임의의 알파벳을 하나 리턴
	public char alphabete() {
		// 문자코드 A ~Z=65~90, a~z = 97~122
		// 임의의 수를 추출해서 char 타입으로 변환
		// 초기값 65 더해야 65부터 122 중 추출 가능
		int num = (int)(Math.random() * 58 +65);
		System.out.println((char)num);
		return (char)num;
	}
	
	// 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열 리턴
	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작인덱스는 포함하고 끝인덱스는 불포함
		System.out.println(str.substring(index1, index2));
		return str.substring(index1, index2);
	}
	
	
}
