package javaQuestionAndTopics;

class Person11 {
	
	public void display() {
		System.out.println("it is person class");
	}
}

class Student11 extends Person11{
	
	@Override 
	public void display() {
		System.out.println("it is student class");
	}
}
public class FinalKeywords {
	public static void main(String[] args) {
		final int age = 22;
//		age = 24;
	}
}
