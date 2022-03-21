package codingQuestionAndTopicPractice;

public class CheckArrayIsSorted {
	public int[] arr = {2,44,6,8,10,12,14,16};
	
	public boolean checkArrayIsSorted() {
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
		CheckArrayIsSorted obj = new CheckArrayIsSorted();
		if (obj.checkArrayIsSorted()) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
	}
}
