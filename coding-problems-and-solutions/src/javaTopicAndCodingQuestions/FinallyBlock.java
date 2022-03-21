package javaTopicAndCodingQuestions;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[2] = 33/2;
			System.exit(1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("it is always run");
		}
	}
}
