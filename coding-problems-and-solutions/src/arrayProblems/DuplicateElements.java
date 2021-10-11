package arrayProblems;

public class DuplicateElements {
	
	public int[] arr = {2, 4, 6, 8, 8, 12, 14, 14, 16};
	
	public void findDupicateElement() {
		int maxValue = this.arr[0];
		int minValue = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > maxValue) {
				maxValue = this.arr[i];
			}
			if (this.arr[i] < minValue) {
				minValue = this.arr[i];
			}
		}
		
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.length; i++) {
			hashTable[this.arr[i]] += 1;
		}
		
		for (int i = minValue; i < maxValue; i++) {
			if (hashTable[i] > 1) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateElements obj = new DuplicateElements();
		obj.findDupicateElement();
	}
}
