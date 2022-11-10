package arrayCodingQuestions.java;

public class CheckArrayIsSorted {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public boolean checkArraySorted() {
		boolean isSorted = true;
		for (int i = 0; i < this.arr.length - 1; i++) {
			if (!(this.arr[i] < this.arr[i + 1])) {
				isSorted = false;
			}
 		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		CheckArrayIsSorted obj = new CheckArrayIsSorted();
		System.out.println("is sorted " + obj.checkArraySorted());
	}
}
