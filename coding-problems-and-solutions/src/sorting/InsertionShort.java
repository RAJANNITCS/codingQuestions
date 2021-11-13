package sorting;

public class InsertionShort {
	public int[] arr = new int[] {8,5,7,3,2};
	
	public void insertionShort() {
		for (int i = 1; i < this.arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (this.arr[j] < this.arr[j - 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j - 1];
					this.arr[j - 1] = temp;
				}
			}
		}
	}
	
	public void display() {
		for (int value: this.arr) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		InsertionShort obj = new InsertionShort();
		obj.insertionShort();
		obj.display();
	}
}
