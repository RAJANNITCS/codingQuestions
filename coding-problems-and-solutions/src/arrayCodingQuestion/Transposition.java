package arrayCodingQuestion;

public class Transposition {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public void display() {
		System.out.println("array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public int transposition(int value) {
		int index = -1;
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				index = i;
				int temp = this.arr[i];
				this.arr[i] = this.arr[i-1];
				this.arr[i-1] = temp;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Transposition obj = new Transposition();
		obj.display();
		System.out.println("index is "+ obj.transposition(6));
		System.out.println("index is "+ obj.transposition(6));
		obj.display();
	}
}
