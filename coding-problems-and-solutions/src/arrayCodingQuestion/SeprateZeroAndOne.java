package arrayCodingQuestion;

public class SeprateZeroAndOne {
	public int[] arr = {1,0,1,1,1,1,0,0,0,0,0,1,1,0};
	
	public void seprateZeroAndOne() {
		int first = 0, last = this.arr.length - 1;
		
		while (first < last) {
			if (this.arr[first] == 0) {
				first++;
			}else if (this.arr[last] == 1) {
				last--;
			}else {
				int temp = this.arr[first];
				this.arr[first] = this.arr[last];
				this.arr[last] = temp;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		SeprateZeroAndOne obj = new SeprateZeroAndOne();
		obj.seprateZeroAndOne();
		obj.display();
	}
}
