package javaQuestionAndTopics;

class Person5 {
	public int age;
	public String name;
	
	public Person5(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Student8 extends Person5 {
	public int rollNo;
	
	public Student8(int rollNo,int age, String name) {
		super(age,name);
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println(this.rollNo+" "+this.age+" "+this.name);
	}
}
public class ConstroucterChaining {
	public static void main(String[] args) {
		Student8 obj = new Student8(22, 29, "rohan");
		obj.display();
	}
}
