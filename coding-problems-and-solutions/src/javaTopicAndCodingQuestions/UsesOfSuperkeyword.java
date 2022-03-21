package javaTopicAndCodingQuestions;

class Bike1 {
	public int startSpeed = 20;
	
	
//	public Bike1(int startSpeed, int topSpeed) {
//		this.startSpeed = startSpeed;
//		this.topSpeed = topSpeed;
//	}
//	
//	public void display() {
//		System.out.println(this.startSpeed+" "+this.topSpeed);
//	}
}

class SuperBike extends Bike1 {
	public String nameOfCom;
	public int topSpeed;
	
	public SuperBike(int topSpeed, String nameOfCom) {
//		super(startSpeed,topSpeed);
		this.topSpeed = topSpeed;
		this.nameOfCom = nameOfCom;
	}
	
	public void displayDetails() {
//		super.display();
		System.out.println(super.startSpeed +" "+ this.topSpeed);
		System.out.println("compnay name is "+this.nameOfCom);
	}
}
public class UsesOfSuperkeyword {
	public static void main(String[] args) {
		SuperBike obj = new SuperBike(280, "ktm");
		obj.displayDetails();
	}
}
