package arrayProblems;

public class OutOfBoundException {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[6] = 40;
		
		for (int value: arr) {
			System.out.println(value);
		}
	}
}
