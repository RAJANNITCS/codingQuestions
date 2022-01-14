package arrayCodingQuestion;

public class LiftShift {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public int liftShift() {
		int shiftValue = this.arr[this.arr.length - 1];
		for (int i = this.arr.length -1 ; i > 0; i--) {
			this.arr[i] = this.arr[i - 1];
		}
		this.arr[0] = 0;
		return shiftValue;
	}
	
	public static void main(String[] args) {
		LiftShift obj = new LiftShift();
		obj.display();
		System.out.println("lift shift value is "+ obj.liftShift());
		obj.display();
	}
}
