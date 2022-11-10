package javaTopicAndCodingQuestions;

class OuterClass {
	static class InnerClass {
		
		public void display() {
			System.out.println("This is inner class");
		}
	}
	
}
public class ClassAsStatic {
	public static void main(String[] args) {
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.display();
	}
}
