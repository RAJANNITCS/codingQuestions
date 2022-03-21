package arrayCodingQuestion;

public class InsertValueAtShortedPositions {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void display() {
		System.out.println("array elements are");
		if (this.numberOfElements != 0) {
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public void add(int value) {
		if (this.numberOfElements != this.arr.length) {
			this.arr[numberOfElements] = value;
			this.numberOfElements++;
		}
	}
	
	public void insertAtShortedPosition(int value) {
		if (this.numberOfElements != this.arr.length) {
			int i = this.numberOfElements;
			while (value < this.arr[i - 1]) {
				this.arr[i] = this.arr[i - 1];
				i--;
			}
			this.arr[i] = value;
			this.numberOfElements++;
		}
	}
	
	public static void main(String[] args) {
		InsertValueAtShortedPositions obj = new InsertValueAtShortedPositions();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.add(14);
		obj.display();
		obj.insertAtShortedPosition(7);
		obj.display();
	}
}
