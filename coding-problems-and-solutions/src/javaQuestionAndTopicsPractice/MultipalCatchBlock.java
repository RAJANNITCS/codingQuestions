package javaQuestionAndTopicsPractice;

public class MultipalCatchBlock {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[4] = 33/2;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
