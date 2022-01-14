package javaQuestionAndTopics;

public class FinallizeMethod {
	public static void main(String[] args) {
		FinallizeMethod obj = new FinallizeMethod();
		FinallizeMethod obj1 = new FinallizeMethod();
		obj = null;
		obj1 = null;
		System.gc();
	}
	
	@Override  
	 protected void finalize()  {
		System.out.println("this is finalize method");
	}
}
