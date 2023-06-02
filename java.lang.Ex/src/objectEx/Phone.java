package objectEx;

public class Phone {
	private String company;
	private String os;
	private String date;
	
	public Phone(String company, String os, String date) {
		this.company = company;
		this.os = os;
		this.date = date;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

}


class smartPhone{
	Phone[] phoneArry = new Phone[3];
	
	void addPhone() {
		phoneArry[0] = new Phone("애플","ios","2022-11");
		phoneArry[1] = new Phone("갤럭시","os","2020-03");
		phoneArry[2] = new Phone("갤럭시","os","2023-01");
	}
	
	smartPhone(){
		
	}
	
	
	@Override
	public String toString() {
		String ss ="";
		for(Phone p :phoneArry) {
			 ss += p.getCompany()+" "+p.getOs()+" "+p.getDate();
		}
		return ss;
	}
	
}
