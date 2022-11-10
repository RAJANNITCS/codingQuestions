package javaTopicAndCodingQuestions;

abstract class Bike60 {
	
	public abstract void run();
	
	public void display() {
		System.out.println("run Bike");
	}
}

class SuperBike60 extends Bike60{
	
	@Override
	public void run() {
		System.out.println("start Bike");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		SuperBike60 obj = new SuperBike60();
		obj.run();
		obj.display();
	}
}
