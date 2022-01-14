package arrayCodingQuestion;

public class MoveToFront {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public int moveToFront(int value) {
		int index = -1;
		for (int i = 0; i <this.arr.length; i++) {
			if (this.arr[i] == value) {
				index = i;
				int temp = this.arr[i];
				this.arr[i] = this.arr[0];
				this.arr[0] = temp;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		MoveToFront obj = new MoveToFront();
		obj.display();
		System.out.println("position of "+obj.moveToFront(6));
		System.out.println("position of "+obj.moveToFront(6));
		obj.display();
	}
}
