package objectEx;

public class Key {
	public int number;
//	public String str;
	
	Key(int number){
		this.number = number;
	}
	
	
	@Override
	public int hashCode() {
		// 주소값을 숫자로 반환
		// 생성된 객체마다 다른 주소값을 가지고 있다
		// super.hascode()
//		str.hashCode();
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개변수 obj가 key로 형변환 가능한지 확인
		// 가능하면 형변환
		// 가능하지 않다면 false return
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	} // 메서드끝
}
