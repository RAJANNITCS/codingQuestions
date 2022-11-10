package javaTopicAndCodingQuestions;

class Person84 {
	
	public void display() {
		System.out.println("Person class");
	}
}

class Student84 extends Person84 {
	
	@Override
	public void display() {
		System.out.println("Student");
	}
}

public class FinalKeywords {
	public static void main(String[] args) {
		Student84 obj = new Student84();
		obj.display();
		final int age = 22;
//		age = 25;
	}
}	
