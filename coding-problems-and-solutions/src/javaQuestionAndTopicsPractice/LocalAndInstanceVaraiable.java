package javaQuestionAndTopicsPractice;

class Person {
	public int age;
	public String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}
public class LocalAndInstanceVaraiable {
	public static void main(String[] args) {
		Person obj = new Person(22, "rohan");
		obj.display();
	}
}
