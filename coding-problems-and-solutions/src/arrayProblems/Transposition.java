package arrayProblems;

public class Transposition {
	public int[] arr = new int[] {2, 4, 6, 8, 10, 12};
	
	public int transposition(int value) {
		if (this.arr[0] == value) {
			return 0;
		}
		
		for (int i = 1; i < this.arr.length; i++) {
			if (this.arr[i] == value) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				return i;
			}
		}
		return -1;
	}
	
	public void dispayArray() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Transposition obj = new Transposition();
		obj.dispayArray();
		System.out.println("index is " + obj.transposition(10));
		obj.dispayArray();
		System.out.println("index is " + obj.transposition(10));
		obj.dispayArray();
	}
}
