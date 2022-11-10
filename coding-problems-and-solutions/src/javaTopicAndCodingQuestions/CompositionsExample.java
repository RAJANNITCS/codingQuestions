package javaTopicAndCodingQuestions;

class Heart {
	public String color;
	public int sizeInInch;
	
	public Heart(String color, int sizeInInch) {
		this.color = color;
		this.sizeInInch = sizeInInch;
	}
}

class Human {
	public String name;
	public int age;
	public Heart heart = new Heart("red", 20);
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(this.name+" "+this.age);
		System.out.println(this.heart.color+" "+this.heart.sizeInInch);
	}
}
public class CompositionsExample {
	public static void main(String[] args) {
		Human obj = new Human("rohan",23);
		obj.display();
	}
}
