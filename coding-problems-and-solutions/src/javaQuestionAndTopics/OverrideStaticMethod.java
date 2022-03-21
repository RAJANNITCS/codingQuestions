package javaQuestionAndTopics;

class Person4 {
	
	public static void display() {
		System.out.println("it is person class");
	}
}

class Student4 extends Person4 {
	
	public static void display() {
		System.out.println("it is student class");
	}
}
  
public class OverrideStaticMethod {
	public static void main(String[] args) {
		Student4 obj = new Student4();
		obj.display();
	}
}
