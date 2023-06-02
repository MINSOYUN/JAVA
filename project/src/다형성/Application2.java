package 다형성;

public class Application2 {
	public static void main(String[] args) {
		Animal2[] animalArry = new Animal2[5];
		
		Dog2 dog = new Dog2("멍뭉이", "말라뮤트", 2);
		Cat2 cat = new Cat2("야옹이", "길고양이", "구로구", "검정");
		
		// 배열의각 방에 고양이또는 멍뭉이 입력
		for(int i=0; i<5; i++) {
			int index = (int)(Math.random()*2);
			if(index == 1) {
				// 배열이름[방번호]
				animalArry[i] = dog;
			} else {
				animalArry[i] = cat;
			}
		}
		
		for(Animal2 a : animalArry) {
			// 자식 객체에서 재정의 되어진 메서드가 호출 
			a.speak();
		}
		
		
	}
}
