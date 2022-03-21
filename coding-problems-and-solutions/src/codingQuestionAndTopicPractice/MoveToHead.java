package codingQuestionAndTopicPractice;

public class MoveToHead {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public int moveToFront(int value) {
		for (int i = 0; i < this.arr.length; i++) {
			if (value == this.arr[i]) {
				int temp = this.arr[0];
				this.arr[0] = this.arr[i];
				this.arr[i] = temp;
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MoveToHead obj = new MoveToHead();
		System.out.println("the index is "+obj.moveToFront(8));
		System.out.println("the index is "+obj.moveToFront(8));
	}
}
