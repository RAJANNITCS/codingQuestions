package arrayProblems;

public class Test {
	
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
		Test objTest = new Test();
		int[] arr = {20, 30, 40, 50, 60};
		System.out.println("min value is =" + objTest.findMin(arr));
	}
}
 