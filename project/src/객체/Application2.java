package 객체;

public class Application2 {
	public static void main(String[] args) {
		Product2 p1 = new Product2("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product2 p2 = new Product2("lgxnote5", "LG스마트폰5", "경기도평택", 780000, 0.7);
		Product2 p3 = new Product2("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("================");
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p2.information());
		System.out.println("================");
		
		p1.calc();
		p2.calc();
		p3.calc();
		
		
		
	}

}

