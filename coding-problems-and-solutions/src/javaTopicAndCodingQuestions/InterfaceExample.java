package javaTopicAndCodingQuestions;

interface Bike666 {
	public final int speedOfBike = 180;
	
	public void run();
	
	public static void getSpeed() {
		System.out.println(speedOfBike);
	}
	
	public default void display() {
		System.out.println("Bike class");
	}
}

class SuperBike666 implements Bike666 {
	
	@Override
	public void run() {
		System.out.println("start Bike");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		SuperBike666 obj = new SuperBike666();
		obj.run();
		obj.display();
		Bike666.getSpeed();
		
	}
}
