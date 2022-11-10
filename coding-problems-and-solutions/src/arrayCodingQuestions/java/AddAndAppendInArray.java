package arrayCodingQuestions.java;

public class AddAndAppendInArray {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void add(int value) {
		if (this.numberOfElements <= this.arr.length) {
			this.arr[numberOfElements] = value;
		}
		this.numberOfElements++;
	}
	
	public void display() {
		if (this.numberOfElements > 0) {
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		AddAndAppendInArray obj = new AddAndAppendInArray();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
	}
}
