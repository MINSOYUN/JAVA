package extendsEx;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRoation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본 생성자가 생성되지 않습니다
		super(location, maxRoation + 2);
	}

	@Override
	public boolean roll() {
		rotation++; //타이어1회전
		// 위치의 '누적 회전 수'와 '최대 회전수' 출력
		System.out.println("***금호타이어***"+location+"누적 회전수: "+rotation);
		System.out.println("***금호타이어***"+location+"최대 회전수: "+maxRotation);
		if(rotation>=maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		} 
		return true;
	}
}
