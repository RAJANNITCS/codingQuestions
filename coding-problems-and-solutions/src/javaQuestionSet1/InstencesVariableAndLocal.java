package javaQuestionSet1;

class Person {
	// Instances variables 
	public int age;
	public String name;
	
	public Person(int age, String name) {
		// age,name is the local varables
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.name+ " " + this.age);
	}
}

public class InstencesVariableAndLocal {
	
	public static void main(String[] args) {
		Person p1 = new Person(22, "rajan");
		p1.display();
	}
}
