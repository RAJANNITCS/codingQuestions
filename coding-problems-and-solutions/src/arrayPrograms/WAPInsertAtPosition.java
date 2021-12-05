package arrayPrograms;

public class WAPInsertAtPosition {
	public int[] arr = new int[10];
	public int numberOfEle = 0;
	
	public void addData(int value) {
		if (this.numberOfEle < this.arr.length) {
			this.arr[this.numberOfEle] = value;
			this.numberOfEle++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void insertAtPosition(int index, int value) {
		if (this.numberOfEle < this.arr.length) {
			for (int i = this.numberOfEle; i > index; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			
			this.arr[index] = value;
			this.numberOfEle++;
		}
	}
	
	public void display() {
		
		if (this.numberOfEle > 0 ) {
			System.out.println("Array elements .");
			for (int i = 0; i < this.numberOfEle; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		WAPInsertAtPosition obj = new WAPInsertAtPosition();
		obj.addData(2);
		obj.addData(4);
		obj.addData(6);
		obj.addData(8);
		obj.addData(10);
		obj.display();
		obj.insertAtPosition(3, 22);
		obj.display();
	}
}
