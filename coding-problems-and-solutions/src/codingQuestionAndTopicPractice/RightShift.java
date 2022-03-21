package codingQuestionAndTopicPractice;

public class RightShift {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public void rightShift() {
		int shiftValue = this.arr[this.arr.length - 1];
		for (int i = this.arr.length - 1; i > 0; i--) {
			this.arr[i] = this.arr[i - 1];
		}
		this.arr[0] = shiftValue;
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		RightShift obj = new RightShift();
		obj.rightShift();
		obj.display();		
	}
}
