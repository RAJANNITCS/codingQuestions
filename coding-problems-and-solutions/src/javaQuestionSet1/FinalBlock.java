package javaQuestionSet1;

public class FinalBlock {
	
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[5] = 33/0;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("always run");
		}
	}
}
