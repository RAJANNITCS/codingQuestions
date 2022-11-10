package javaTopicAndCodingQuestions;

class Person99 implements Cloneable{
	public int age;
	public String name;
	
	public Person99(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class MarkedInterfacesExamples {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person99 p1 = new Person99(19, "rohan");
		Person99 p2 = (Person99) p1.clone();
		p2.age = 33;
		p1.display();
		p2.display();
	}
}
