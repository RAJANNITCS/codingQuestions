package arrayCodingQuestions.java;

public class GetSetMinMaxReverse {
	public int[] arr = {2,4,6,8,10,12,14,16,18,20};
	
	public int findMaxValue( ) {
		int maxValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (maxValue < this.arr[i]) {
				maxValue = this.arr[i];
			}
		}
		return maxValue;
	}
	
	public int findMinValue() {
		int minValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (minValue > this.arr[i]) {
				minValue = this.arr[i];
			}
		}
		return minValue;
	}
	
	public int getValue(int index) {
		if (index < this.arr.length) {
			return this.arr[index];
		}
		return -1;
	}
	
	public void setValue(int index, int value) {
		if (this.arr.length > index) {
			this.arr[index] = value;
		}
	}
	
	public void reverseArray() {
		int front = 0, last = this.arr.length - 1;
		
		while (front <= last) {
			int temp = this.arr[front];
			this.arr[front] = this.arr[last];
			this.arr[last] = temp;
			front++;
			last--;
		}
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		GetSetMinMaxReverse obj = new  GetSetMinMaxReverse();
		System.out.println("max Value is "+ obj.findMaxValue());
		System.out.println("min value is "+ obj.findMinValue());
		obj.setValue(3, 55);
		obj.display();
		System.out.println("get value is "+ obj.getValue(4));
		obj.reverseArray();
		obj.display();
	}
}
