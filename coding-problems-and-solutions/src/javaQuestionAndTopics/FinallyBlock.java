package javaQuestionAndTopics;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[5] = 33/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("it is always run");
		}
	}
}
