package arrayCodingQuestion;

public class CheckArrayIsSorted {
	public int[] arr = {2,4,6,8,77,12,14,16,18,20};
	
	public boolean checkArrayIsSorted() {
		for (int i = 1; i < this.arr.length - 1; i++) {
			if (!(this.arr[i] > this.arr[i - 1])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		CheckArrayIsSorted obj = new CheckArrayIsSorted();
		System.out.println(obj.checkArrayIsSorted());
	}
}
