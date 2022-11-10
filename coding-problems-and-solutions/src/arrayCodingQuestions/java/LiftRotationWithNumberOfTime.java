package arrayCodingQuestions.java;

public class LiftRotationWithNumberOfTime {
	public int[] arr = {2,4,6,8,10,12,14,16,18};
	
	public void liftRotationWithNumberOfTime(int num) {
		int i = 0; 
		while (i < num) {
			int shiftNumber = this.arr[0];
			for (int j = 0; j < this.arr.length - 1; j++) {
				this.arr[j] = this.arr[j + 1];
			}
			this.arr[this.arr.length - 1] = shiftNumber;
			i++;
		}
	}
	
	public void display() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	public static void main(String[] args) {
		LiftRotationWithNumberOfTime obj = new LiftRotationWithNumberOfTime();
		obj.liftRotationWithNumberOfTime(2);
		obj.display();
	}
}
