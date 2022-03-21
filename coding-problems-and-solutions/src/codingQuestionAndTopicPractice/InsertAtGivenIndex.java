package codingQuestionAndTopicPractice;

public class InsertAtGivenIndex {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	public void addAndAppend(int value) {
		if (this.numberOfValue != this.arr.length) {
			this.arr[this.numberOfValue] = value;
			this.numberOfValue++;
		}
	}
	
	public void insertAtGivenIndex(int value, int index) {
		if (index < this.numberOfValue) {
			for (int i = this.numberOfValue; i > index; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			
			this.arr[index] = value;
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
	
	public static void main(String[] args) {
		InsertAtGivenIndex obj = new InsertAtGivenIndex();
		obj.addAndAppend(2);
		obj.addAndAppend(4);
		obj.addAndAppend(6);
		obj.addAndAppend(8);
		obj.display();
		System.out.println("after insert");
		obj.insertAtGivenIndex(22, 3);
		obj.display();
	}
}
