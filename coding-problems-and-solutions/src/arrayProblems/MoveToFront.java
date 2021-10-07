package arrayProblems;

public class MoveToFront {
	
	public int[] arr = {2, 4, 6, 8, 10, 12};
	
	public int moveToFront(int value) {
		if (value == this.arr[0]) {
			return 0;
		}
		for (int i = 1; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				int temp = this.arr[0];
				this.arr[0] = this.arr[i];
				this.arr[i] = temp;
				return i;
			}
		}
		return -1;
	}
	
	public void displayArray() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		MoveToFront obj = new MoveToFront();
		obj.displayArray();
		System.out.println("index is " + obj.moveToFront(10));
		obj.displayArray();
		System.out.println("index is " + obj.moveToFront(10));
		obj.displayArray();
	}
}
