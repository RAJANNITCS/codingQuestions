package javaTopicAndCodingQuestions;

class Person3 {
	
	public void display() {
		System.out.println("person class");
	}
}

class Student3 extends Person3 {
	
	@Override
	public void display() {
		System.out.println("student class");
	}
}

public class MethodOverride {
	public static void main(String[] args) {
		Student3 obj = new Student3();
		obj.display();
		
	}
}
