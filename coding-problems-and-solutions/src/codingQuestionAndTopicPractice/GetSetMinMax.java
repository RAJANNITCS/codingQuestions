package codingQuestionAndTopicPractice;

public class GetSetMinMax {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	public void add(int value) {
		if (numberOfValue != this.arr.length) {
			this.arr[this.numberOfValue] = value;
			this.numberOfValue++;
		}
	}
	
	public int getValue(int index) {
		if (this.numberOfValue > index) {
			return this.arr[index];
		}
		return -1;
	}
	
	public void setValue(int value, int index) {
		if (this.numberOfValue > index) {
			this.arr[index] = value;
		}
	}
	
	public void display() {
		if (this.numberOfValue > 0) {
			for (int i = 0; i < this.numberOfValue; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public int minValue() {
		if (this.numberOfValue > 0) {
			int minValue = this.arr[0];
			for (int i = 0; i < this.numberOfValue; i++) {
				if (this.arr[i] < minValue) {
					minValue = this.arr[i];
				}
			}
			return minValue;
		}
		return -1;
	}
	
	public int maxValue() {
		if (this.numberOfValue > 0) {
			int maxValue = this.arr[0];
			for (int i = 0; i < this.numberOfValue; i++) {
				if (this.arr[i] > maxValue) {
					maxValue = this.arr[i];
				}
			}
			return maxValue;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		GetSetMinMax obj = new GetSetMinMax();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
//		System.out.println(obj.minValue());
//		System.out.println(obj.maxValue());
//		obj.setValue(33, 4);
//		obj.display();
		System.out.println(obj.getValue(3));
	}
}
