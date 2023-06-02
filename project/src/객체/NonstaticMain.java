package 객체;

public class NonstaticMain {
	public static void main(String[] args) {
		Nonstatic sample = new Nonstatic();
		
		sample.printLottoNumbers();
		
		// char 하나의 글자를 '' 홑따옴표 안에 입력
		// 글자를 꼭 입력해야 합니다
		sample.outputChar(5, 'a');
		
		sample.alphabete();
		
		// 특정 문자열을 추출하는 방법
		sample.mySubstring("apple", 2, 4);
	}
	
}
