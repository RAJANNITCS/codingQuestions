package javaQuestionSet1;

class Bike1 {
	public void display() {
		System.out.println("This is bike");
	}
}

class SuperBike extends Bike1 {
	
	@Override
	public void display() {
		System.out.println("This is super bike");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		SuperBike obj = new SuperBike();
		obj.display();
	}
}
