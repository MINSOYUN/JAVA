package practice;

public class ExMember {
	String name = "민소윤";
	String id = "syhymin";
	String password = "12345";
	int age ;
	
	public ExMember(String name) { // 생성자
		this.name = name;
	}

	
	public ExMember() {  // 기본생성자
	}

	public int age2() {  // 메서드
		return age += 10;
	} 
//	public void age2() {
//		age += 10;
//		}
		
	public static void main(String[] args) {
		ExMember member = new ExMember();
		System.out.println("member.name: "+member.name);
		
		ExMember member2 = new ExMember();
		member2.name = "홍길동";
		System.out.println("member2.name: "+member2.name);
		
		member.age2(); // 메서드
		System.out.println(member.age); // 필드작성하기
	}
	
}


