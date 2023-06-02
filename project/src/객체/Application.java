package 객체;

public class Application {
	public static void main(String[] args) {
	 Product num1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
	 Product num2 = new Product("lgxnote5", "LG스마트폰5", "경기도평택", 780000, 0.7);
	 Product num3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
	 
	System.out.println(num1.information());
	System.out.println(num2.information());
	System.out.println(num3.information());
	System.out.println("====================");
	 
	num1.setPrice(1200000);
	num2.setPrice(1200000);
	num3.setPrice(1200000);
	num1.setTax(0.05);
	num2.setTax(0.05);
	num3.setTax(0.05);
	System.out.println(num1.information());
	System.out.println(num2.information());
	System.out.println(num3.information());
	System.out.println("====================");
	
		num1.calc();
		num2.calc();
		num3.calc();
	}
	
	
	
	
	
	
	
}
