package javaQuestionSet1;

class Bike4 {
	public int modelNo = 10;
	
	public void display() {
		System.out.println("only bike");
	}
}

class SuperBikes extends Bike4 {
	public String name;
	public int modelNo = 22;
	
	public SuperBikes(int modelNo, String CompanyName) {
		this.modelNo = modelNo;
		this.name = CompanyName;
	}
	
	public void display() {
		super.display();
		System.out.println(super.modelNo);
	}
}

public class SuperKeywords {
	public static void main(String[] args) {
		SuperBikes obj = new SuperBikes(12, "KTM");
		obj.display();
		
	}
}
