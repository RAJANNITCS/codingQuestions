package javaTopicAndCodingQuestions;

class Person {
	public int age;
	public String name;
	
	public Person(int age_1,String name_1) {
		this.age = age_1;
		this.name = name_1;
	}
	
	public void display() {
//		System.out.println(age_1);
		System.out.println(this.age+" "+this.name);
	}
}

public class InstanceVariableAndLocalVariable {
	public static void main(String[] args) {
		Person p1 = new Person(29, "rohan");
		p1.display();
		
	}
}
