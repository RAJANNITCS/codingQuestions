package javaQuestionSet1;

class Person2 {
	public String name;
	
	public Person2(String name) {
		this.name = name;
	}
	public void printDetail() {
		System.out.println(this.name);
	}
}

class Student1 extends Person2 {
	public int rollNo;
	
	public Student1(String name, int rollNo) {
		super(name);
		this.rollNo = rollNo;
	}
	
	@Override
	public void printDetail() {
		System.out.println(this.name+ "" + this.rollNo);
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Student1 obj = new Student1("rohan", 16);
		obj.printDetail();
	}
}
