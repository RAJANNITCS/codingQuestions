package javaTopicAndCodingQuestions;

class Person4 {
	
	public static void display() {
		System.out.println("This is person class");
	}
}

class Student2 extends Person4 {
	
	public static void display() {
		System.out.println("This is statudent class");
	}
}
public class OverrideStaticMethod {
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.display();
	}
}
