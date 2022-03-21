package arrayCodingQuestion;

public class LeftRotationNumberOfTime {
	public int[] arr = {2,4,6,8,10,12,14,16,18,20};
	
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public void leftRotation(int numberOfTime) {
		int i = 0;
		while (i < numberOfTime) {
			int shiftValue = this.arr[this.arr.length - 1];
			for (int j = this.arr.length - 1; j > 0; j--) {
				this.arr[j] = this.arr[j - 1];
			}
			this.arr[0] = shiftValue;
			i++;
		}
	}
	
	public static void main(String[] args) {
		LeftRotationNumberOfTime obj = new LeftRotationNumberOfTime();
		obj.display();
		obj.leftRotation(2);
		obj.display();
	}
}
