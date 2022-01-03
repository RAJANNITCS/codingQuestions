package sorting;

public class BubbleSort {
	public int[] arr = {8,5,7,3,2};
	
	public void bubbleSort() {
		boolean isSorted = false;
		for (int i = 0; i < this.arr.length - 1; i++) {
			isSorted = true;
			for (int j = 0; j < (this.arr.length - 1 - i); j++) {
				if (this.arr[j] > this.arr[j + 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j + 1];
					this.arr[j + 1]  = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}
	
	public void display() {
		System.out.println("Array elements are ");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		obj.display();
		obj.bubbleSort();
		obj.display();
	}
}
