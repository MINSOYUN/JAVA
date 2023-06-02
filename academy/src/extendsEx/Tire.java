package extendsEx;

public class Tire {
	// 최대회전수
	// 타이어가 생성될 때 초기화
	public int maxRotation;
	// 누적회전수
	public int rotation;
	// 아이어의 위치
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation){
		// 필드 초기화
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	/**
	 * 타이어 1회전 - 1번 실행 할 때 마다 누적회전수를 증가
	 * 만약 maxRotaion 최대 회전수보다 크면 false 리턴합니다
	 * @return
	 */
	public boolean roll() {
		rotation++; //타이어1회전
		// 위치의 '누적 회전 수'와 '최대 회전수' 출력
		System.out.println(location+"누적 회전수: "+rotation);
		System.out.println(location+"최대 회전수: "+maxRotation);
		if(rotation>=maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		} 
		return true;
	}
	
}
