package javaQuestionAndTopicsPractice;

public class finallyBlock {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[2] = 33/2;
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("it is always run");
		}
	}
}
