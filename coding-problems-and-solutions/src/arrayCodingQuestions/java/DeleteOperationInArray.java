package arrayCodingQuestions.java;

public class DeleteOperationInArray {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void add(int value) {
		if (this.numberOfElements <= this.arr.length) {
			this.arr[this.numberOfElements] = value;
			this.numberOfElements++;
		}
	}
	
	public void display() {
		if (this.numberOfElements > 0) {
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public int deleteElements(int index) {
		int deleteValue = index < this.numberOfElements ? this.arr[index] : 0;
		for (int i = index; i < this.numberOfElements; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		if (index < this.numberOfElements) {
			this.numberOfElements--;
		}
		return deleteValue;
	}
	
	public static void main(String[] args) {
		DeleteOperationInArray obj = new  DeleteOperationInArray();
		obj.add(2);
		obj.add(4);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("delete value is"+obj.deleteElements(5));
		obj.display();
		
	}
}
