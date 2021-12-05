package arrayPrograms;

public class WAPaddAndAppendInArray {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void addInArray(int value) {
		if (this.numberOfElements < this.arr.length) {
			this.arr[this.numberOfElements] = value;
			this.numberOfElements++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void display() {
		if (this.numberOfElements == 0) {
			System.out.println("Array is empty");
		}else {
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		WAPaddAndAppendInArray obj = new WAPaddAndAppendInArray();
		obj.addInArray(2);
		obj.addInArray(4);
		obj.addInArray(6);
		obj.display();
	}
}
