package javaQuestionAndTopicsPractice;

class Person3 {
	
	public void display() {
		System.out.println("this is Person class");
	}
}

class Student2 extends Person3 {
	
	@Override
	public void display() {
		System.out.println("this is Student class");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.display();
	}
}
