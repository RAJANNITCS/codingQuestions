package codingQuestionAndTopicPractice;

public class AddAndAppendValue {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	public void addAndAppend(int value) {
		if (this.numberOfValue != this.arr.length) {
			this.arr[this.numberOfValue] = value;
			this.numberOfValue++;
		}
	}
	
	public void display() {
		if (this.numberOfValue != 0) {
			for (int i = 0; i < this.numberOfValue; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		AddAndAppendValue obj = new AddAndAppendValue();
		obj.addAndAppend(2);
		obj.addAndAppend(4);
		obj.addAndAppend(6);
		obj.addAndAppend(8);
		obj.addAndAppend(10);
		obj.addAndAppend(12);
		obj.display();
	}
}
