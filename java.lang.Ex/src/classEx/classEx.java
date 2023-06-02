package classEx;

public class classEx {
	public static void main(String[] args) {
		// Class 변수명 = 클래스이름.class;
//		Class clazz = Car.class;
		
		Class clazz;
		try {
			// Class class = Class.forName("패키지이름.클래스이름")
			// 해당경로(패키지를 포함한 클래스이름)에 클래스가 존재 할 경우 클래스를 반환
			// 없는 경우 오류 발생
			
			// 라이브러리가 잘 로드되었는지 확인 할 때사용
			clazz = Class.forName("system.Car");
			// 오류 발생 예제 -> 클래스 정보를 얻기 실패
//			clazz = Class.forName("system.Car1");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			// 클래스 경로를 활용하여 리소스 절대경로를 얻어오기
			// getResource에 "사진이름작성".getPath(); 
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보를 얻기 실패");
		}
		
		
		
	}
}
