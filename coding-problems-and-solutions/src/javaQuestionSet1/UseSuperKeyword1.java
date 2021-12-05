package javaQuestionSet1;

class Vehical1 {
	int minSpeed = 20;
	
	public void startWith() {
		System.out.println("Start with "+this.minSpeed);
	}
}

class Car1 extends Vehical1 {
	int maxSpeed = 180;
	
	public void carSpeedRenge() {
		super.startWith();
		System.out.println("max Speed "+this.maxSpeed);
	}
}

public class UseSuperKeyword1 {
	
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.carSpeedRenge();
	}
}
