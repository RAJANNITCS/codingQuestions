package arrayPrograms;

public class GetSetMinMaxReverse {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public int getValue(int index) {
		if (this.arr.length > index) {
			return this.arr[index];
		}
	    System.out.println("plz Enter currect index");
	    return -1;
	}
	
	public void setValue(int index, int value) {
		if (index < this.arr.length) {
			this.arr[index] = value;
			return;
		}
		System.out.println("plz enter currect index");
		return;
	}
	
	public int minValue() {
		int minValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] < minValue) {
				minValue = this.arr[i];
			}
		}
		return minValue;
	}
	
	public int maxValue() {
		int maxValue = this.arr[0];
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > maxValue) {
				maxValue = this.arr[i];
			}
		}
		return maxValue;
	}
	
	public void reverseArray() {
		int first = 0, last = this.arr.length - 1;
		while (first < last) {
			int temp = this.arr[first];
			this.arr[first] = this.arr[last];
			this.arr[last] = temp;
			first++;
			last--;
		}
	}
	
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		GetSetMinMaxReverse obj = new GetSetMinMaxReverse();
		System.out.println("get value of index 3 = " + obj.getValue(3));
		obj.setValue(3, 22);
		obj.display();
		System.out.println("min element = "+ obj.minValue());
		System.out.println("max element = "+ obj.maxValue());
		obj.reverseArray();
		obj.display();
		
	}
}
