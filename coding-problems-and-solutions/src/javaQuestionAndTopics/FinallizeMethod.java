package javaQuestionAndTopics;

public class FinallizeMethod {
	public static void main(String[] args) {
		FinallizeMethod obj_1 = new FinallizeMethod();
		FinallizeMethod obj_2 = new FinallizeMethod();
		obj_1 = null;
		obj_2 = null;
		
		System.gc();
	}
	
	@Override
	protected void finalize() {
		System.out.println("it run before of gc");
	}
}
