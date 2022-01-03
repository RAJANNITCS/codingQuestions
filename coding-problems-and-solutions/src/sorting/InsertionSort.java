package sorting;

public class InsertionSort {
	public int[] arr = {6,5,3,2};
	
	public void insertionSort() {
		for (int i = 0; i < this.arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (this.arr[j] < this.arr[j - 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j - 1];
					this.arr[j - 1] = temp;
				}
			}
		}
	}
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		obj.display();
		obj.insertionSort();
		obj.display();
	}
}
