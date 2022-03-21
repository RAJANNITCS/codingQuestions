package javaQuestionAndTopics;

class Human implements Cloneable{
	public int age;
	public String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
	
	public Human clone() throws CloneNotSupportedException {
		return (Human) super.clone();
	}
}

public class ObjectCloningExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human obj1 = new Human(22, "rohan");
		Human obj2 = (Human) obj1.clone();
		obj2.display();
	}
}
