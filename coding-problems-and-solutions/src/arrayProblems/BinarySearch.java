package arrayProblems;
import java.util.Arrays;

public class BinarySearch {
	
	public int[] arr = {12, 4, 6, 16, 10, 2, 14, 8};
	
	public int binarySearch(int value) {
		Arrays.sort(this.arr);
		int lowIndex = 0;
		int higIndex = this.arr.length;
		int mid = 0;
		
		while (lowIndex <= higIndex) {
			mid = (lowIndex + higIndex) / 2;
			
			if (this.arr[mid] == value) {
				return mid;
			}else if (this.arr[mid] < value) {
				lowIndex = mid + 1;
			}else if (this.arr[mid] > value) {
				higIndex = mid - 1;
			}
		}
		
		return -1;
	}
	
	public void displayArray() {
		System.out.println("Array elements are !!");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		obj.displayArray();
		System.out.println("index is "+ obj.binarySearch(12));
		
	}
}
