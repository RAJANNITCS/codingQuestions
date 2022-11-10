package arrayCodingQuestions.java;

public class TranspositionsOfArray {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public int transpositionsOfArray(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				if (i != 0) {
					int temp = this.arr[i];
					this.arr[i] = this.arr[i - 1];
					this.arr[i - 1] = temp;
				}
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		TranspositionsOfArray obj = new TranspositionsOfArray();
		System.out.println("index is "+ obj.transpositionsOfArray(10));
		System.out.println("index is "+ obj.transpositionsOfArray(10));
	}
}
