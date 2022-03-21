package arrayCodingQuestion;

public class FindMaxmimDifference {
	public int[] arr = {4,3,10,2,9,1,6};
	
	public void findMaximDifference() {
		int maxValue = 0;
		int firstElement = 0, secondElement = 0;
		for (int i = 0; i < this.arr.length; i++) {
			for (int j = i + 1; j < this.arr.length; j++) {
				if (this.arr[i] < this.arr[j] && (this.arr[j] - this.arr[i] > maxValue)) {
					maxValue = this.arr[j] - this.arr[i];
					firstElement = this.arr[i];
					secondElement = this.arr[j];
				}
			}
		}
		
		System.out.println(firstElement +" "+ secondElement);
	}
	
	public static void main(String[] args) {
		FindMaxmimDifference obj = new FindMaxmimDifference();
		obj.findMaximDifference();		
	}
}
