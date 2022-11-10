package arrayCodingQuestions.java;

public class PerformInsertOperationsInArray {
	public int[] arr = new int[10];
	public int numberOfElmenets = 0;
	
	public void add(int value) {
		if (this.numberOfElmenets <= this.arr.length) {
			this.arr[numberOfElmenets] = value;
			this.numberOfElmenets++;
		}
	}
	
	public void dispaly() {
		if (this.numberOfElmenets > 0) {
			for (int i = 0; i < this.numberOfElmenets; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public void insertAtGivenPossitions(int value,int index) {
		if (index <= this.numberOfElmenets) {
			for (int i = this.numberOfElmenets; i > index; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			
			this.arr[index] = value;
			this.numberOfElmenets++;
		}
	}
	
	public static void main(String[] args) {
		PerformInsertOperationsInArray obj = new PerformInsertOperationsInArray();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.dispaly();
		obj.insertAtGivenPossitions(22, 3);
		obj.dispaly();
	}
}
