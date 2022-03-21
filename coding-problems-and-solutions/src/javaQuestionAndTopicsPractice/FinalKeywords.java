package javaQuestionAndTopicsPractice;

class Bike1 {
	
	public void display() {
		System.out.println("this is bike class");
	}
}

class SuperBike4 extends Bike1 {
	
	@Override
	public void display() {
		System.out.println("this is super Bike class");
	}
}
public class FinalKeywords {
	public static void main(String[] args) {
		final int age = 22;
//		age = 23;
	}
}
