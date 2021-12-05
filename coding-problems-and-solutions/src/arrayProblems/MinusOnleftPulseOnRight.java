package arrayProblems;

public class MinusOnleftPulseOnRight {
	
	public int[] arr = {-1, 4, -2, 6, 8, -3, 9, -6};
	
	public void arrangDate() {
		int i = 0;
		int j = this.arr.length - 1;
		
		while (i < j) {
			if (this.arr[i] < 0) {
				i++;
			}else if(this.arr[j] > 0) {
				j--;
			}else {
				int tempValue = this.arr[i];
				this.arr[i] = this.arr[j];
				this.arr[j] = tempValue;
				i++;
				j--;
				
			}
		}
	}
	
	public void displayArray() {
		for (int value: this.arr) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		MinusOnleftPulseOnRight obj = new MinusOnleftPulseOnRight();
		obj.arrangDate();
		obj.displayArray();
		
	}
}
