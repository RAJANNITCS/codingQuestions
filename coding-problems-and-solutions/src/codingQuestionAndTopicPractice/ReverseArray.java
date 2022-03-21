package codingQuestionAndTopicPractice;

public class ReverseArray {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public void reverse() {
		int front = 0;
		int endPoint = this.arr.length - 1;
		
		while (front < endPoint) {
			int temp = this.arr[front];
			this.arr[front] = this.arr[endPoint];
			this.arr[endPoint] = temp;
			front++;
			endPoint--;
		}
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		obj.reverse();
		obj.display();
	}
}
