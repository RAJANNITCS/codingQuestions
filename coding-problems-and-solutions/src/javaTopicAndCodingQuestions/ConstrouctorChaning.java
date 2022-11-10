package javaTopicAndCodingQuestions;

class Person55 {
	public int age;
	public String name;
	
	public Person55() {
		this(18,"Person");
	}
	
	public Person55(int age,String name) {
		this.age = age;
		this.name = name;
	}

}

class Student55 extends Person55 {
	public String rollNo;
	
	public Student55(int age,String name, String rollNo) {
		super(age,name);
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name+" "+this.rollNo);
	}
}

public class ConstrouctorChaning {
	public static void main(String[] args) {
		Student55 obj = new Student55(18, "rohan", "16ca6016");
		obj.display();
	}
}
