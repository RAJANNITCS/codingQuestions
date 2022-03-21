package javaQuestionAndTopics;

class Person6 implements Cloneable{
	public int age;
	public String name;
	
	public Person6(int age, String name) {
		this.age = age;
		this.name = name;
	}
	  
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}


public class MarkedInterface {
	public static void main(String[] args) throws CloneNotSupportedException{
		Person6 obj = new Person6(22, "rohan");
		Person6 obj1 = (Person6) obj.clone();
		obj1.display();
	}
}
