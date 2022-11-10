package arrayCodingQuestions.java;

public class BinarySearchForArray {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public int binarySearch(int value) {
		int front = 0, last = this.arr.length - 1;
		int mid = 0;
		
		while (front < last) {
			mid = (front + last) /2;
			if (this.arr[mid] == value) {
				return mid;
			}else if (this.arr[mid] < value) {
				front = mid + 1;
			}else {
				last = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearchForArray obj = new BinarySearchForArray();
		System.out.println("possitions is" + obj.binarySearch(12));
	}
}
