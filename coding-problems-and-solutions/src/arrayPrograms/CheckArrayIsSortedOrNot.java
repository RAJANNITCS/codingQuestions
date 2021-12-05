package arrayPrograms;

public class CheckArrayIsSortedOrNot {
	public int[] arr = {2,4,6,18,10,12,14,16};
	
	public boolean checkArraySorted() {
		boolean isSorted = true;
		for (int i = 0; i < this.arr.length - 1; i++) {
			if (this.arr[i] < this.arr[i + 1]) {
				isSorted = true;
			}else {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		CheckArrayIsSortedOrNot obj = new CheckArrayIsSortedOrNot();
		if (obj.checkArraySorted() == false) {
			System.out.println("array is not sorted");
		}else {
			System.out.println("array is sorted");
		}
	}
}
