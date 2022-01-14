package arrayCodingQuestion;

public class AddAndAppend {
	public int[] arr = new int[10];
	public int numOfele = 0;

	public void add(int value) {
		if (this.numOfele != this.arr.length) {
			this.arr[this.numOfele] = value;
			this.numOfele++;
		}
	}
	
	public void display() {
		if (this.numOfele != 0) {
			for (int i = 0; i < this.numOfele; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		AddAndAppend obj = new AddAndAppend();
		obj.add(2);
		obj.add(4);
		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(12);
		obj.display();
	}
}
