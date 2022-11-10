package javaTopicAndCodingQuestions;

class Bike {
	public int startSpeed;
	public int topSpeed;
	
	public Bike() {
		this.startSpeed = 10;
		this.topSpeed = 180;
	}
	
	public Bike(int startSpeed, int topSpeed) {
		this.startSpeed = startSpeed;
		this.topSpeed = topSpeed;
	}
	
	public void display() {
		System.out.println(this.startSpeed+" "+this.topSpeed);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Bike normalBike = new Bike();
		normalBike.display();
		Bike superBike = new Bike(10, 300);
		superBike.display();
		
	}
}
