package codingQuestionAndTopicPractice;

public class Transposition {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	
	public void add(int value) {
		if (this.numberOfValue < this.arr.length) {
			this.arr[this.numberOfValue] = value;
			this.numberOfValue++;
		}
	}
	
	public void display() {
		if (this.numberOfValue > 0) {
			for (int i = 0; i < this.numberOfValue; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public int tranposition(int value) {
		for (int i = 0; i < this.numberOfValue; i++) {
			if (this.arr[i] == value) {
				int temp = this.arr[i];
				this.arr[i] = this.arr[i-1];
				this.arr[i - 1] = temp;
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Transposition obj = new Transposition();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
		System.out.println("index is "+ obj.tranposition(8));
		System.out.println("index is "+ obj.tranposition(8));
	}
}
