package arrayCodingQuestions.java;

public class LinearSearchForArray {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public int LinearSearchExm(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		LinearSearchForArray obj = new LinearSearchForArray();
		System.out.println(obj.LinearSearchExm(10));
	}
}
