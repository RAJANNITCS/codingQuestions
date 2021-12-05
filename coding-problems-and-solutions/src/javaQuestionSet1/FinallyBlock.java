package javaQuestionSet1;

public class FinallyBlock {
	
	public static void main(String[] args) {
		try {
			int sum = 0;
			sum  = 30/0;
		}catch(Exception e) {
			System.out.println("Exception occure");
		}finally {
			System.out.println("collection closed");
		}
	}
}
