package javaQuestionAndTopics;

class Person1 {
	private int age;
	private String name;
	
	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}
public class DataEncapsulation {
	public static void main(String[] args) {
		Person1 obj = new Person1(22, "rohan");
		obj.display();
//		obj.age = 22;
	}
}
