package arrayCodingQuestion;

public class ReverseArray {
	public int[] arr = {2,4,6,8,10,12,14,16,18,20};
	
	public void reverseArray() {
		int first = 0, last = this.arr.length - 1;
		while (first < last) {
			int temp = this.arr[first];
			this.arr[first] = this.arr[last];
			this.arr[last] = temp;
			first++;
			last--;
		}
	}
	
	public void dispay() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		obj.reverseArray();
		obj.dispay();
	}
}
