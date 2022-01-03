package javaQuestionSet1;

public class ExceptionEX {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[2] = 33/2;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
