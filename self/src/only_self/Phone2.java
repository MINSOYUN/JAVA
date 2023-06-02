package only_self;

	import java.util.Scanner;

	public class Phone2 {
		
		String model = "아이폰";
		int num;
		String color;
		int price;
		
		Phone2() { // 기본생성자
		}
		
		Phone2(int num){
			this(num, null, 150);
			}
		Phone2(int num, String color){
			this(num, color, 200);
			}
		Phone2(int num, String color, int price){
			this.num = num;
			this.color = color;
			this.price = price;
			}
		Phone2(int num, int price){
			this(num, "화이트", price);
			}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); // 메인메서드 벗어나면 static써야하는이유
			
			Phone2 myPhone1 = new Phone2(); 
			System.out.print("이름을 입력하세요: \n");
			String name = scan.next();
			System.out.println("이름: :"+name);
			System.out.println("=========");
			
			System.out.println("myPhone1:");
			System.out.println("원하는 색상을 입력하세요.");
			String color2 = scan.next();  // scanner
			myPhone1.color = color2; 
			System.out.println(myPhone1.color); // 합쳐서 출력 못하는지..
			System.out.println();
			
			System.out.println("myPhone2:");
			Phone2 myPhone2 = new Phone2(14); 
			System.out.println(myPhone2.num);
			System.out.println(myPhone2.color);
			System.out.println(myPhone2.price);
			System.out.println();
			
			System.out.println("myPhone3:");
			Phone2 myPhone3 = new Phone2(15, "그래파이트"); 
			System.out.println(myPhone3.num);
			System.out.println(myPhone3.color);
			System.out.println(myPhone3.price);
			System.out.println();
			
			System.out.println("myPhone4:");
			Phone2 myPhone4 = new Phone2(13, "블랙", 130);
			System.out.println(myPhone4.num);
			System.out.println(myPhone4.color);
			System.out.println(myPhone4.price);
			System.out.println();
			
			System.out.println("myPhone5:");
			Phone2 myPhone5 = new Phone2(15, 210);
			System.out.println(myPhone5.num);
			System.out.println(myPhone5.color);
			System.out.println(myPhone5.price); 
			
			  Phone2[] myPhone = new Phone2[5]; // 1. Phone 타입의 배열을 생성하자
			 myPhone[0] = new Phone2();  // 2. 배열이름[인덱스] 작성하기
			 myPhone[1] = new Phone2(14);
			 myPhone[2] = new Phone2(15, "그래파이트");
			 myPhone[3] = new Phone2(13, "블랙", 130);
			 myPhone[4] = new Phone2(15, 210);
			 
			 // 타입 변수명 : 배열의 이름
			 for(Phone2 phone :myPhone) { // 3. myPhone 타입에서 가져와서 phone 타입에 저장해라
				 System.out.println(phone.model); // 4. syso (변수명.필드);
				 System.out.println(phone.num);
				 System.out.println(phone.color);
				 System.out.println(phone.price);
				 System.out.println();
			 } 
		}
	}
