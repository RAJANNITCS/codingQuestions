package javaQuestionAndTopics;

class Person {
	// here age and name are instance variable 
	public int age;
	public String name;
	
	// here age and name are local variable
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}
public class InstanceVarAndlocalVar {
	public static void main(String[] args) {
		Person obj = new Person(22, "rohan");
		obj.display();
	}
}
