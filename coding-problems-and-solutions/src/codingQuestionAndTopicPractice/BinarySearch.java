package codingQuestionAndTopicPractice;

public class BinarySearch {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public int binarySearch(int value) {
		int front = 0, last = this.arr.length - 1;
		int midValue = 0;
		while (front <= last) {
			midValue = (front + last) / 2;
			
			if (this.arr[midValue] == value) {
				return midValue;
			}else if(this.arr[midValue] < value) {
				front = midValue + 1;
			}else {
				last = midValue - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		System.out.println(obj.binarySearch(2));
	}
	
}
