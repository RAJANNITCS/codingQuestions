package javaTopicAndCodingQuestions;

class Person1 {
	private int age;
	private String name;
	
	public Person1(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			this.age = 1;
		}else {
			this.age = age;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}

public class DataEncapsulations {
	public static void main(String[] args) {
		Person1 p1 = new Person1(20, "rohan");
		p1.setAge(19);
		p1.display();
		
	}
}
