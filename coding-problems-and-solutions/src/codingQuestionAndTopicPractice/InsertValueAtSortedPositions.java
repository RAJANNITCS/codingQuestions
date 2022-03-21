package codingQuestionAndTopicPractice;

public class InsertValueAtSortedPositions {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	public void add(int value) {
		if (this.numberOfValue != this.arr.length) {
			this.arr[this.numberOfValue] = value;
			this.numberOfValue++;
		}
	}
	
	public void insertValue(int value) {
		for (int i = this.numberOfValue; i >= 0; i--) {
			if (this.arr[i - 1] > value) {
				this.arr[i] = this.arr[i - 1];
			}else {
				this.arr[i] = value;
				this.numberOfValue++;
				return;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < this.numberOfValue; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertValueAtSortedPositions obj = new InsertValueAtSortedPositions();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.display();
		obj.insertValue(5);
		obj.display();
	}
}
