package interfaceEx;

import interfaceEx.Audio;
import interfaceEx.SmartTv;
import interfaceEx.RemoteControl;

public class  Myclass {
	// 인터페이스는 생성 할 수 없다
	// 인터페이스는 필드, 생성자의 매개변수
	// 메소드의 매개변수나 , 메소드의 로컬 변수의 타입으로 사용 할 수있다.
	// -> 다형성
	
	// 인터페이스가 필드의 타입으로 선언된 경우
	// 인터페이스의 구현체만 인터페이스를 타입으로 사용할 수 있다.
	RemoteControl rc = new SmartTv();
	
	// 생성자
	public Myclass(RemoteControl rc) {
		// 매개변수로 받아온 rc를 필드에 저장
		this.rc = rc;
	}
	
	public Myclass() {
		
	}
	
	// 메서드
	public void methodA() {
		// Audio 객체를 생성하여 RemoteControl 타입으로 자동 변환
		// 인터페이스의 타입(RemoteControl)으로역변수 생성(메소드 내부에 있음)
		RemoteControl rc = new Audio();
		// 생성된 객체(new Audio())를 필드(this.rc)에 저장
		this.rc = rc;
	}
	public void methodB(RemoteControl rc) {
		// 매개변수로 넘어온 rc를  필드(this.rc)에 저장
		this.rc = rc;
	}
	
}	
