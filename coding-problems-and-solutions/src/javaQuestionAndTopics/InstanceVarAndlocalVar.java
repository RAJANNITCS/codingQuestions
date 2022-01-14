package javaQuestionAndTopics;

class Person {
	// here age and name is instance variable
	public int age;
	public String name;
	
	// here age and name is local variable
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void displayDetail() {
		System.out.println(this.name+" "+ this.age);
	}
}

public class InstanceVarAndlocalVar {
	public static void main(String[] args) {
		Person rohan = new Person(22,"rohan");
		rohan.displayDetail();
	}
}
