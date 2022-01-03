package javaQuestionSet1;

class Person2 {
	public int age;
	public String name;
	
	public final void display() {
		System.out.println(this.name+" "+this.age);
	}
}

class Student2 extends Person2 {
	
}

public class FinalKeyword {
	public static void main(String[] args) {
		final int value = 55;
		
//		value = 50;
		
	}
}
