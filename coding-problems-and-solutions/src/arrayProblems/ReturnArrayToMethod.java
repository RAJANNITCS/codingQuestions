package arrayProblems;

public class ReturnArrayToMethod {
	
	public int[] reverseArray(int[] arr) {
		int[] reverseArrayValue = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			reverseArrayValue[j] = arr[i];
		}
		return reverseArrayValue;
	}
	
	public static void main(String[] args) {
		ReturnArrayToMethod obj = new ReturnArrayToMethod();
		int[] reverseArrayValue = obj.reverseArray(new int[]{20, 30, 40, 50, 60});
		for (int value: reverseArrayValue) {
			System.out.println(value);
		}
	}
}
