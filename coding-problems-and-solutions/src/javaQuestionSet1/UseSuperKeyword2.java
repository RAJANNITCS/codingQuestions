package javaQuestionSet1;

class Vehicle {
	int maxSpeed = 120;
}

class Car extends Vehicle {
	int maxSpeed = 180;
	
	public void dispaySpeed() {
		System.out.println("max speed is "+ super.maxSpeed);
	}
}

public class UseSuperKeyword2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.dispaySpeed();
	}
}
