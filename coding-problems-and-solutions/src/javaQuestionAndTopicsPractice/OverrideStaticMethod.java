package javaQuestionAndTopicsPractice;

class Person4 {
	
	public static  void display() {
		System.out.println("This is person class");
	}
}

class Student3 extends Person4 {
	
	public static void display() {
		System.out.println("this is student class");
	}
}

public class OverrideStaticMethod {
	public static void main(String[] args) {
		Student3 obj = new Student3();
		obj.display();
	}
}
