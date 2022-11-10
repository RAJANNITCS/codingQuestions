package arrayCodingQuestions.java;

public class InsertValueAtSortedPos {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void add(int value) {
		if (this.numberOfElements < this.arr.length) {
			this.arr[this.numberOfElements] = value;
			this.numberOfElements++;
		}
	}
	
	public void display() {
		for (int i = 0; i < this.numberOfElements; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public void insertAtSorted(int value) {
		int i = this.numberOfElements;
		while (i > 0 && this.arr[i - 1] > value) {
			this.arr[i] = this.arr[i - 1];
			i--;
		}
		this.arr[i] = value;
		this.numberOfElements++;
	}
	
	public static void main(String[] args) {
		InsertValueAtSortedPos obj = new InsertValueAtSortedPos();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.display();
		obj.insertAtSorted(5);
		System.out.println("afer insert");
		obj.display();
	}
}
