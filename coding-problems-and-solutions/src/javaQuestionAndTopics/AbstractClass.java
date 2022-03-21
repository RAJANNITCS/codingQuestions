package javaQuestionAndTopics;

abstract class Bike2 {
	
	public abstract void run();
}

class SuperBike2 extends Bike2 {
	
	public void run() {
		System.out.println("run super bike");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		SuperBike2 obj = new SuperBike2();
		obj.run();
	}
}
