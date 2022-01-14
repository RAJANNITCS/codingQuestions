package javaQuestionAndTopics;

class Bike1 {
	public int startSpeed = 20;
	public int topSpeed = 180;
	
//	public Bike1 (int startSpeed, int topSpeed) {
//		this.startSpeed = startSpeed;
//		this.topSpeed = topSpeed;
//	}
	
	public void displayDetail() {
		System.out.println("start speed "+ this.startSpeed + " "+ "top speed "+ this.topSpeed);
	}
}

class SuperBike1 extends Bike1 {
	public int startSpeed;
	public int topSpeed;
	public String nameOfCompany;
	
	public SuperBike1(String nameOfCompany, int startSpeed, int topSpeed) {
//		super(startSpeed, topSpeed);
		this.nameOfCompany = nameOfCompany;
	}
	
	public void displayDetail() {
//		super.displayDetail();
		System.out.println(super.startSpeed);
		System.out.println("name of company " + this.nameOfCompany);
	}
}

public class SuperKeywords {
	public static void main(String[] args) {
		SuperBike1 obj = new SuperBike1("KTM", 20, 200);
		obj.displayDetail();
	}
}
