package objectEx;

public class ExMember {
	private String id;
	private String name;
	
	ExMember(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.id+": "+this.name;
	}
	
	public static void main(String[] args) {
		ExMember member = new ExMember("blue", "이파란");
		System.out.println(member);
		System.out.println(member.toString());
	}
	
}
