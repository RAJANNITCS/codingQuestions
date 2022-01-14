package javaQuestionAndTopics;

class Person2 {
	public int age;
	public String name;
	
	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void displayDetail() {
		System.out.println(this.name+" "+this.age);
	}
}

class Student extends Person2 {
	public int rollNo;
	
	public Student(int rollNo, int age, String name) {
		super(age,name);
		this.rollNo = rollNo;
	}
	
	@Override
	public void displayDetail() {
		System.out.println(this.rollNo+" "+this.name+" "+this.age);
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Student rohan = new Student(16012,22,"rohan");
		rohan.displayDetail();
	}
}
