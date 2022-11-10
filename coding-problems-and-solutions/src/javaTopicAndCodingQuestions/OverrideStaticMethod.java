package javaTopicAndCodingQuestions;

class Person4 {
	
	public static void dispaly() {
		System.out.println("This is person class");
	}
}

class Student4 extends Person4 {
	
	public static void display() {
		System.out.println("This is student class");
	}
}
public class OverrideStaticMethod {
	public static void main(String[] args) {
		Student4.display();
	}
}
