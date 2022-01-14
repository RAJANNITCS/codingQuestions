package arrayCodingQuestion;

public class GetSetMinMaxAndReverseArray {
	public int[] arr = {2,4,6,8,10,12,14,16,18,20};
	
	public void display() {
		System.out.println("array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public int get(int index) {
		if (index != this.arr.length) {
			return this.arr[index];
		}
		return -1;
	}
	
	public void set(int index, int value) {
		if (this.arr.length > index) {
			this.arr[index] = value;
		}
	}
	
	public int minValue() {
		int tempValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] < tempValue) {
				tempValue = this.arr[i];
			}
		}
		return tempValue;
	}
	
	public int maxValue() {
		int tempValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > tempValue) {
				tempValue = this.arr[i];
			}
		}
		return tempValue;
	}
	
	public void reverseArray() {
		int front = 0, last = this.arr.length - 1;
		while (front <= last) {
			int tempValue = this.arr[front];
			this.arr[front] = this.arr[last];
			this.arr[last] = tempValue;
			front++;
			last--;
		}
	}
	
	public static void main(String[] args) {
		GetSetMinMaxAndReverseArray obj = new GetSetMinMaxAndReverseArray();
		obj.display();
		System.out.println("get value " + obj.get(4));
		obj.set(4, 55);
		obj.display();
		System.out.println("min value "+ obj.minValue());
		System.out.println("max value "+ obj.maxValue());
		obj.reverseArray();
		obj.display();
	}
}
