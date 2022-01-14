package arrayCodingQuestion;

public class InsertAtGivenIndex {
	public int[] arr = new int[10];
	public int numOfEle = 0;
	
	public void add(int value) {
		if (this.numOfEle != this.arr.length) {
			this.arr[this.numOfEle] = value;
			this.numOfEle++;
		}
	}
	
	public void insertAtIndex(int index, int value) {
		for (int i = this.numOfEle; i > index; i--) { 
			this.arr[i] = this.arr[i - 1];
		}
		this.arr[index] = value;
		this.numOfEle++;
	}
	
	public void display() {
		if (this.numOfEle != 0) {
			System.out.println("array elements are");
			for (int i = 0; i < this.numOfEle; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		InsertAtGivenIndex obj = new InsertAtGivenIndex();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.display();
		obj.insertAtIndex(2, 22);
		obj.display();
	}
}
