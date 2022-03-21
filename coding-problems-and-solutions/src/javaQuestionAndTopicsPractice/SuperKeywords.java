package javaQuestionAndTopicsPractice;

class Bike2 {
	public int startSpeed = 20;
//	public int topSpeed;
	
//	public Bike2(int startSpeed, int topSpeed) {
//		this.startSpeed =startSpeed;
//		this.topSpeed = topSpeed;
//	}
//	
//	public void display() {
//		System.out.println(this.startSpeed+"to"+this.topSpeed);
//	}
}

class SuperBike2 extends Bike2 {
	public String nameOfCom;
	public int topSpeed;
	
	public SuperBike2(int topSpeed,String nameOfCom) {
//		super(startSpeed,topSpeed);
		this.topSpeed = topSpeed;
		this.nameOfCom = nameOfCom;
	}
	
	public void displayBikeDetails() {
//		super.display();
		System.out.println(super.startSpeed+" "+this.topSpeed);
		System.out.println(this.nameOfCom);
	}
}
public class SuperKeywords {
	public static void main(String[] args) {
		SuperBike2 obj = new SuperBike2(250, "KTM");
		obj.displayBikeDetails();
	}
}
