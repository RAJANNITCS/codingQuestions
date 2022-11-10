package javaTopicAndCodingQuestions;

class Bike66 {
	public int startSpeed = 10;
	public int topSpeed = 180;
	
//	public Bike66(int startSpeed, int topSpeed) {
//		this.startSpeed = startSpeed;
//		this.topSpeed = topSpeed;
//	}
//	
//	public void display() {
//		System.out.println(this.startSpeed+" "+this.topSpeed);
//	}
}

class SuperBike66 extends Bike66 {
	public String nameOfBike;
	public int startSpeed;
	public int topSpeed;
	
	public SuperBike66(int startSpeed, int topSpeed, String nameOfBike) {
//		super(startSpeed, topSpeed);
		this.startSpeed = startSpeed;
		this.topSpeed = topSpeed;
		this.nameOfBike = nameOfBike;
	}
	
	public void displayDetils() {
//		super.display();
		System.out.println(super.startSpeed);
		System.out.println(this.topSpeed);
		System.out.println(this.nameOfBike);
	}
}
public class UsesOfSuperkeyword {
	public static void main(String[] args) {
		SuperBike66 obj = new SuperBike66(50, 200, "KTM");
		obj.displayDetils();
	}
}
