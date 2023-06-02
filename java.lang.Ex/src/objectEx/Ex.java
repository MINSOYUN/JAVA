package objectEx;

public class Ex {
	int s;
	
	Ex(int s){
		s = s;
	}
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		boolean result = obj1 ==obj2;
		System.out.println(result);
		System.out.println(obj1.equals(obj2));
		
		String s1 = new String();
		String s2 = new String();
		boolean r = s1 == s2;
		System.out.println(r);
		System.out.println(s1.equals(s2));
		
		Ex e1 = new Ex(2);
		Ex e2 = new Ex(2);
		boolean re = e1 == e2;
		System.out.println(re); 
		System.out.println(e1.equals(e2));
		
		
		
	}
}
