package extendsEx;

public class Driver {
	// 메서드
	void drive(Vehicle vehicle) {
		// Vehicle을 상속받아 구현된 객체가 매개변수로 입력된 경우
		// 부모타입으로 자동 형변환 된 경우!! 
		// 만약 vehicle의 원래 타입이 Bus가 맞다면
		// 생성된 인스턴스(객체) instanceof 타입
		// 나의 원래 생성된 타입

		Vehicle v = new Bus();
		Vehicle v1 = new Vehicle();
		// new 연산자에 의해 생성된 타입을 확인
		// 부모타입이 자식타입으로 강제 캐스팅 될 경우 오류가 발생
	if(vehicle instanceof Bus) {
		Bus bus = (Bus)vehicle;
		System.out.println("bus타입으로 변환 성공");
	} else {
		System.out.println("bus타입으로 변환 불가능 합니다");
	}
		
	vehicle.run();	
	}		

	
	}

