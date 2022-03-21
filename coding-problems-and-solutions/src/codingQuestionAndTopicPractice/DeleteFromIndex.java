package codingQuestionAndTopicPractice;

public class DeleteFromIndex {
	public int[] arr = new int[10];
	public int numberOfValue = 0;
	
	public void addAndAppend(int value) {
		if (this.numberOfValue != this.arr.length) {
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
	
	public int deleteFromIndex(int index) {
		int deleteValue = 0;
		if (index < this.numberOfValue) {
			deleteValue = this.arr[index];
			for (int i = index; i < this.numberOfValue; i++) {
				this.arr[i] = this.arr[i+1];
			}
		}
		
		return deleteValue;
	}
	
	public static void main(String[] args) {
		DeleteFromIndex obj = new DeleteFromIndex();
		obj.addAndAppend(2);
		obj.addAndAppend(4);
		obj.addAndAppend(6);
		obj.addAndAppend(8);
		obj.addAndAppend(10);
		obj.display();
		System.out.println("Delete value is "+obj.deleteFromIndex(2));
	}
}
