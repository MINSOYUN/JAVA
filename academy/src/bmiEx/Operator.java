package bmiEx;

public class Operator {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		// bite, short, char타입은 연산시에 int 타입으로 변환 되어서 연산됩니다.
		// 그 결과 int 타입이 반환 됩니다.
		int intValue2 = byteValue + byteValue1; 
		byte byteValue2 = (byte)(byteValue + byteValue1);
		System.out.println(intValue2);
		System.out.println(byteValue2);
		
		// ====실수의 연산====
		int iValue = 10;
		double dValue = 5.5;
		double result = iValue + dValue;
		System.out.println((double)iValue);
		System.out.println((double)5/2);  // 5/(double)2, (double)(5/2)와 같음
		
		// =====문자열을 기본타입으로 강제 타입변환하는 방법
		String str = "10";
		// parseInt(string s): int -> String타입의 매개변수를 넣고 실행결과 int 타입을 반환
		System.out.println("=====문자열을 기본타입으로 강제 타입변환======");
		int i = Integer.parseInt(str);
		System.out.println(i);

		String i1 = "10";
		String i2 = "200";
		String i3 = "300000";
		String i4 = "40000000000";
		String i5 = "12.345";
		String i6 = "true";
		byte value = Byte.parseByte(i1);
		short value2 = Short.parseShort(i2);
		long value3 = Long.parseLong(i3);
		float value4 = Float.parseFloat(i4);
		double value5 = Double.parseDouble(i5);
		boolean value6 = Boolean.parseBoolean(i6);
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		System.out.println("====기본타입을 문자열로 변환====");
		String strValue = String.valueOf(123.11);
		System.out.println(strValue);
		System.out.println(String.valueOf('가'));
		System.out.println(String.valueOf(12345));
		
	}

}
