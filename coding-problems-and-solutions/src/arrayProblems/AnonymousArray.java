package arrayProblems;

public class AnonymousArray {
	
	public int findMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		AnonymousArray obj = new AnonymousArray();
		System.out.println("min value is "+obj.findMin(new int[]{20, 30, 40, 50, 60}));
	}
}
