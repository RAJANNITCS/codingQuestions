package javaTopicAndCodingQuestions;

public class FinalizeMathod {
	public static void main(String[] args) {
		FinalizeMathod obj_1 = new FinalizeMathod();
		FinalizeMathod obj_2 = new FinalizeMathod();
		obj_1 = null;
		obj_2 = null;
		
		System.gc();
	}
	
	@Override
	protected void finalize() {
		System.out.println("it run just before of gc");
	}
}
