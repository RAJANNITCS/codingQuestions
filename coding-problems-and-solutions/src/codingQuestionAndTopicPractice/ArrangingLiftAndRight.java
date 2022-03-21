package codingQuestionAndTopicPractice;

public class ArrangingLiftAndRight {
	public int[] arr = {-1,2,-2,3,-3,4,-4,5,-5,6,-6};
	
	public void arrangingLiftAndRight() {
		int front = 0, last = this.arr.length - 1;
		while (front < last) {
			if (this.arr[front] < 0) {
				front++;
			}else if (this.arr[last] > 0) {
				last--;
			}else {
				int temp = this.arr[front];
				this.arr[front] = this.arr[last];
				this.arr[last] = temp;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrangingLiftAndRight obj = new ArrangingLiftAndRight();
		obj.arrangingLiftAndRight();
		obj.display();
	}
}
