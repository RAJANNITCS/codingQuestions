package javaTopicAndCodingQuestions;

class Person3 {
	
	public void display() {
		System.out.println("this is person class");
	}
}

class Student1 extends Person3 {
	
	@Override
	public void display() {
		System.out.println("this is Student class");
	}
}
public class FinalKeywords {
	public static void main(String[] args) {
		final int age = 22;
//		age = 34;
		System.out.println(age);
	}
}
