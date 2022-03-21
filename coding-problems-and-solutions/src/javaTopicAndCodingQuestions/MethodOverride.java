package javaTopicAndCodingQuestions;

class Person2 {
	
	public void display() {
		System.out.println("This is Person class");
	}
}

class Student extends Person2{
	
	@Override
	public void display() {
		System.out.println("This is Student class");
	}
}

public class MethodOverride {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.display();
	}
}
