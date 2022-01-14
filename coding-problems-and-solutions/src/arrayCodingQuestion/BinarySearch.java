package arrayCodingQuestion;

public class BinarySearch {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public void display() {
		System.out.println("Array elements are");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public int binarySearch(int value) {
		int index = -1;
		int startPoint = 0, endPoint = this.arr.length - 1;
		int mid = 0;
		while (startPoint <= endPoint) {
			mid = (startPoint + endPoint) / 2;
			if (this.arr[mid] == value) {
				index = mid;
				return index;
			}else if (this.arr[mid] < value) {
				startPoint = mid + 1;
			}else {
				endPoint = mid - 1;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		obj.display();
		System.out.println("position is " + obj.binarySearch(8));
	}
}
