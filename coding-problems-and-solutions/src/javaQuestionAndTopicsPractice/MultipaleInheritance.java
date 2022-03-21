package javaQuestionAndTopicsPractice;

class A {
	
	public void display() {
		System.out.println("class A");
	}
}

class B {
	
	public void display() {
		System.out.println("class B");
	}
}

class C extends A {
	
}

public class MultipaleInheritance {
	public static void main(String[] args) {
		C obj = new C();
		obj.display();
	}
}
