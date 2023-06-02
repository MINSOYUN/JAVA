package 다형성;

public class Dog2 extends Animal2{
	public static final String PLACE = "애견카페";
	
	private int weight;
	
	Dog2(){
		
	}

	public Dog2(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
	}
	
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		// 부모의 메서드를 호출
		System.out.println(super.toString() + "몸무게는 "+ weight+"kg 입니다.");
	}
	
	
}
