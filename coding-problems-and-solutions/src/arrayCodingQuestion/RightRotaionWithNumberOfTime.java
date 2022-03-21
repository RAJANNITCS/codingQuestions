package arrayCodingQuestion;

public class RightRotaionWithNumberOfTime {
	public int[] arr = {2,4,6,8,10,12,14,16,18,20};
	
	public void rightRotation(int numberOfTime) {
		int i = 0;
		while (i < numberOfTime) {
			int shiftValue = this.arr[0];
			for (int j = 0; j < this.arr.length - 1; j++) {
				this.arr[j] = this.arr[j+1];
			}
			this.arr[this.arr.length - 1] = shiftValue; 
			i++;
		}
	}
	
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		RightRotaionWithNumberOfTime obj = new RightRotaionWithNumberOfTime();
		obj.display();
		obj.rightRotation(2);
		obj.display();
	}
}
