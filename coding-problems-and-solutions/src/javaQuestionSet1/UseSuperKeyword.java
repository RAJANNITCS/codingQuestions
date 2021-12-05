package javaQuestionSet1;

class Person4 {
	public String name;
	public int age;
	
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student3 extends Person4 {
	public int rollNo;
	public Student3(String name, int age,int rollNo) {
		super(name,age);
		this.rollNo = rollNo;
	}
	
	public void dispayDetails() {
		System.out.println(this.name+" "+this.age+" "+this.rollNo);
	}
}
public class UseSuperKeyword {
	public static void main(String[] args) {
		Student3 obj = new Student3("rohan",22,16);
		obj.dispayDetails();
	}
	
}
