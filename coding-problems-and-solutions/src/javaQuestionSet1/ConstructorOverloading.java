package javaQuestionSet1;

class Bike {
	public int startSpeed;
	public int endSpeed;
	
	public Bike() {
		this.startSpeed = 20;
		this.endSpeed = 180;
	}
	
	public Bike(int startSpeed, int endSpeed) {
		this.startSpeed = startSpeed;
		this.endSpeed = endSpeed;
	}
	
	public void display() {
		System.out.println(this.startSpeed+" "+this.endSpeed);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Bike hero = new Bike();
		hero.display();
		Bike ktm = new Bike(20, 250);
		ktm.display();
	}
}
