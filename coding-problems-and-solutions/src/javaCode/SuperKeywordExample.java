package javaCode;

class Vehicle {
	public int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void showSpeed() {
		System.out.println("Top speed is "+ this.maxSpeed);
	}
}

class Car extends Vehicle {
	
	public int number;
	
	public Car(int maxSpeed,int number) {
		super(maxSpeed);
		this.number = number;
	}
	
	public void showSpeed() {
		System.out.println("Top speed is "+ this.maxSpeed);
	}
}

public class SuperKeywordExample {
	
	public static void main(String[] args) {
		Car objCar  = new Car(200,1256);
		objCar.showSpeed();
	}
}
