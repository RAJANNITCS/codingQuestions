package arrayProblems;

public class FindSecondMaxElement {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16};
		int maxValue = arr[0];
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				value = maxValue;
				maxValue = arr[i];
			}
		}
		
		System.out.println(value);
		
	}
}
