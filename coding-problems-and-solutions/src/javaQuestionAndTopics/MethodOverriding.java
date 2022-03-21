package javaQuestionAndTopics;

class Person2 {
	
	public void display() {
		System.out.println("this is person class");
	}
}

class Student extends Person2 {
	
	@Override
	public void display() {
		System.out.println("this is student class");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.display();
	}
}
