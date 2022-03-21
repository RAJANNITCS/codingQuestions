package javaQuestionAndTopics;

interface First {
	
	void display();
}

interface Second {
	
	void display();
}

class Third implements First, Second{
	
	public void display() {
		System.out.println("Class third");
	}
}

public class MultipaleInterheritance {
	public static void main(String[] args) {
		Third obj = new Third();
		obj.display();
	}
}
