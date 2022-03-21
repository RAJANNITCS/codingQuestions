package codingQuestionAndTopicPractice;

public class LinearSearch {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public int linearSearch(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (value == this.arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		System.out.println(obj.linearSearch(3));
	}
}
