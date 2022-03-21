package javaQuestionAndTopics;

interface PersonEat {
	public void eat();
}

interface PersonTravel {
	public void travel();
}

class Student5 implements PersonEat, PersonTravel {
	
	public void eat() {
		System.out.println("student eat");
	}
	
	public void travel() {
		System.out.println("student are travel");
	}
}

public class MultipaleInheritance {
	public static void main(String[] args) {
		Student5 obj = new Student5();
		obj.eat();
		obj.travel();
	}
}
