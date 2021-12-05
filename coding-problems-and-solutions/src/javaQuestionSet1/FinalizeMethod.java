package javaQuestionSet1;

public class FinalizeMethod {
	
	public static void main(String[] args) {
		FinalizeMethod obj = new FinalizeMethod();
		FinalizeMethod obj1 = new FinalizeMethod();
		obj = null;
		obj1 = null;
		
		System.gc();
		System.out.println("gragabe collection is called");
		
	}
	
	@Override
	public void finalize() {
		System.out.println("clean other task");
	}
}
