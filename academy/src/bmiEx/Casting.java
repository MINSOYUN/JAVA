package bmiEx;

public class Casting {

	public static void main(String[] args) {
		int iValue = 1234;
		char charValue = (char)iValue;
		System.out.println(iValue);
		System.out.println(charValue);
		
		long lValue = 500;
		iValue = (int)lValue;
		System.out.println(iValue);
		
		float fValue = 3.14f;
		iValue = (int) fValue;
		System.out.println(iValue);
		
		
		// -128~127
		// 변환 하려는 타입에 들어갈 수 있는 값인지 꼭 확인
		// 강제 형변환시 주의
		int intValue = 150;
		byte byteValue = (byte)intValue;
		
		System.out.println("======");
		System.out.println(intValue);
		System.out.println(byteValue); // 초과하면 로테이션 돼서 -128출력 (127 다음 -128)
	}

}
