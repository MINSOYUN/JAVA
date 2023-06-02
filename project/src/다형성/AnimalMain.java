package 다형성;

public class AnimalMain {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		
		
		Animal ani = new Dog("할루", "말티즈", 3);
		ani.speak();
		
		Animal ani2 = new Cat("아휴","모잇냐", "서울","하양");
		ani2.speak();
		
		
			for(int i=0; i<5; i++) {
				int random = (int)(Math.random()*2);
				if(random ==0) {
					animal[i] =  ani;
					
				} else { 
					animal[i] =  new Dog("할루", "말티즈", 3);
				}
			} //for문 끝
			
		
		
		for(int j=0; j<5; j++) {
			animal[j].speak();
		}
		
	}
}
