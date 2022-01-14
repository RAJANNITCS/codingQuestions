package arrayCodingQuestion;

public class RightShift {
	public int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}

	public int rightShift() {
		int shiftValue = this.arr[0];
		for (int i = 0; i < this.arr.length - 1; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		this.arr[this.arr.length - 1] = 0;
		return shiftValue;
	}

	public static void main(String[] args) {
		RightShift obj = new RightShift();
		obj.display();
		System.out.println("right shift value is "+ obj.rightShift());
		obj.display();
	}
}
