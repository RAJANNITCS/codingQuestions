package codingQuestionAndTopicPractice;

public class LiftShift {
	public int[] arr = {2,4,6,8,10,12,14,16};
	
	public void liftShift() {
		int shiftValue = this.arr[0];
		for (int i = 0; i < this.arr.length - 1; i++) {
			this.arr[i] = this.arr[i + 1];
		}
		this.arr[this.arr.length - 1] = shiftValue;
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		LiftShift obj = new LiftShift();
		obj.liftShift();
		obj.display();
	}
	
}
