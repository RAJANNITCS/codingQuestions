package arrayPrograms;

public class WAPforDeleteAtGivenPostion {
	public int[] arr = new int[10];
	public int numberOfElements = 0;
	
	public void addElement(int value) {
		if (this.numberOfElements < this.arr.length) {
			this.arr[this.numberOfElements] = value;
			this.numberOfElements++;
		}
	}
	
	public int deleteVale(int index) {
		int tempValue = this.arr[index];
		for (int i = index; i < this.numberOfElements ; i++) {
			this.arr[i] = this.arr[i+1];
		}
		this.numberOfElements--;
		return tempValue;
	}
	
	public void display() {
		if (this.numberOfElements > 0) {
			System.out.println("Array elements ");
			for (int i = 0; i < this.numberOfElements; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		WAPforDeleteAtGivenPostion obj = new WAPforDeleteAtGivenPostion();
		obj.addElement(2);
		obj.addElement(4);
		obj.addElement(6);
		obj.addElement(8);
		obj.addElement(10);
		obj.addElement(12);
		obj.addElement(14);
		obj.addElement(16);
		obj.display();
		System.out.println("Delete value is "+obj.deleteVale(3));
		obj.display();
		
	}
}
