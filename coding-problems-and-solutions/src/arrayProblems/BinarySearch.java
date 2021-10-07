package arrayProblems;

public class BinarySearch {
	
	public int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
	
	public int binarySearch(int value) {
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
