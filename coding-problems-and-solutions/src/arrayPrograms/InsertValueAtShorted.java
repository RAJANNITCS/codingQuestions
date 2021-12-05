// wap for insert a value at shorted position
package arrayPrograms;


public class InsertValueAtShorted {
	public int[] arr = new int[10];
	public int numberOfElement = 0;
	
	public void add(int value) {
		if (this.numberOfElement < this.arr.length) {
			this.arr[this.numberOfElement] = value;
			this.numberOfElement++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void display() {
		if (this.numberOfElement > 0) {
			System.out.println("array elements arr");
			for (int i = 0; i < this.numberOfElement; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public void insert(int value) {
		int i = this.numberOfElement - 1;
		while (this.arr[i] > value) {
			this.arr[i + 1] = this.arr[i];
			i--;
		}
		this.arr[i + 1] = value;
	}
	
	public static void main(String[] args) {
		InsertValueAtShorted obj = new InsertValueAtShorted();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		obj.insert(7);
		obj.display();
	}
}
