package arrayCodingQuestion;

public class DeleteFromGivenIndex {
	public int[] arr = new int[10];
	public int numOfEle = 0;
	
	public void add(int value) {
		if (this.numOfEle != this.arr.length) {
			this.arr[this.numOfEle] = value;
			this.numOfEle++;
		}
	}
	
	public int deleteFromIndex(int index) {
		int deleteValue = -1;
		if (index < this.numOfEle) {
			deleteValue = this.arr[index];
		}
		
		for (int i = index; i < this.numOfEle; i++) {
			this.arr[i] = this.arr[i+1];
		}
		this.numOfEle--;
		return deleteValue;

	}
	
	public void display() {
		if (this.numOfEle != 0) {
			System.out.println("Array elements");
			for (int i = 0; i < this.numOfEle; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		DeleteFromGivenIndex obj = new DeleteFromGivenIndex();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
		System.out.println("delete value "+obj.deleteFromIndex(2));
		obj.display();
	}
}

