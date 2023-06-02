package practice;

public class ExSwitch {

	public static void main(String[] args) {
		int score = 90;
		switch (score) {
		case 100:
			System.out.println("당신은 A 입니다");
			break;

		case 90:
			System.out.println("당신은 B 입니다");
			break;
			
		case 80:
			System.out.println("당신은 C 입니다");
			break;
			
		case 70:
			System.out.println("당신은 D 입니다");
			break;
			
		default:
			System.out.println("당신은 F 입니다");
			break;
		}
	}

}
