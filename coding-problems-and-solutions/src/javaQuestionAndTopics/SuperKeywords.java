package javaQuestionAndTopics;

class Bike1 {
	public int startSpeed = 20;
//	public int topSpeed;
	
//	public Bike1(int startSpeed,int topSpeed) {
//		this.startSpeed = startSpeed;
//		this.topSpeed = topSpeed;
//	}
	
//	public void display() {
//		System.out.println(this.startSpeed+" to "+this.topSpeed);
//	}
}

class SuperBike extends Bike1 {
	public String nameOfCom;
	public int topSpeed;
	
	public SuperBike(int topSpeed,String nameOfCom) {
//		super(startSpeed,topSpeed);
		this.topSpeed = topSpeed;
		this.nameOfCom = nameOfCom;
	}
	
	public void superBikeDetails() {
//		super.display();
		System.out.println(super.startSpeed+ "to "+this.topSpeed);
		System.out.println(this.nameOfCom);
	}
}
public class SuperKeywords {
	public static void main(String[] args) {
		SuperBike ktm = new SuperBike(250, "KTM");
		ktm.superBikeDetails();
	}
}
