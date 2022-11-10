package arrayCodingQuestions.java;

public class MoveToFront {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public int moverToFront(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				if (i != 0) {
					int temp = this.arr[i];
					this.arr[i] = this.arr[0];
					this.arr[0] = temp;
				}
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		MoveToFront obj = new MoveToFront();
		System.out.println("The possitions is "+ obj.moverToFront(10));
		System.out.println("The possitions is "+ obj.moverToFront(10));
	}
}
