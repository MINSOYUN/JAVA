package only_self;

public class Grade {

	public static void main(String[] args) {
		int grade = 90;
		
		switch (grade) {
		case 100:
			System.out.println("1번으로 가세요");
			break;
		case 90:
			System.out.println("2번으로 가세요");
			break;
		case 80:
			System.out.println("3번으로 가세요");
			break;
		case 70:
			System.out.println("4번으로 가세요");
			break;
		default:
			System.out.println("5번으로 가세요");
			break;
		}
	}

}
