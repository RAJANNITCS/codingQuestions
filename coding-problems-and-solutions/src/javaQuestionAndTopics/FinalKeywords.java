package javaQuestionAndTopics;

class Person3 {
	public int age;
	public String name;
	
	public Person3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void displayDetail() {
		System.out.println(this.name+" "+this.age);
	}
}

class Student1 extends Person3 {
	public int rollNo;
	
	public Student1(int rollNo, int age, String name) {
		super(age,name);
	}
	
	@Override
	public void displayDetail() {
		System.out.println(this.rollNo+" "+this.age+" "+this.name);
	}
}

public class FinalKeywords {
	public static void main(String[] args) {
		int age = 22;
		age = 23;
	}
}
