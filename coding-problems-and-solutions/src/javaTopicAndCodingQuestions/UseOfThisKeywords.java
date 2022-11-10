package javaTopicAndCodingQuestions;

class Person21 {
	public int age;
	public String name;
	
	public Person21(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}

public class UseOfThisKeywords {
	public static void main(String[] args) {
		Person21 p1 = new Person21(20, "rohan");
		p1.display();
	}
}
