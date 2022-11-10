package javaTopicAndCodingQuestions;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[3] = 33/3;
//			System.exit(1);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			System.out.println("it run");
		}
	}
}
