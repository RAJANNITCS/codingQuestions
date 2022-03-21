package javaQuestionAndTopicsPractice;

public class FinallizeMethod {
	public static void main(String[] args) {
		FinallizeMethod obj = new FinallizeMethod();
		FinallizeMethod obj_1 = new FinallizeMethod();
		obj = null;
		obj_1 = null;
		
		System.gc();
	}
	
	@Override
	protected void finalize() {
		System.out.println("it run before of gc");
	}
}
