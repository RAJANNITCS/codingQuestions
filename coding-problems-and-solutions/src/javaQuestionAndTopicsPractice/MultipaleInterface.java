package javaQuestionAndTopicsPractice;

interface A1 {
	public void display();
}

interface B1 {
	public void display();
}

class C1 implements A1, B1 {
	
	public void display() {
		System.out.println("class C");
	}
}
public class MultipaleInterface {
	public static void main(String[] args) {
		C1 obj = new C1();
		obj.display();
	}
}
