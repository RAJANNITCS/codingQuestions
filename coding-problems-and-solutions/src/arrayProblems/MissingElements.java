package arrayProblems;

public class MissingElements {
	
	public int[] arr = {2, 4, 6, 8, 10, 12, 14, 15};
	public int[] missingElements = null;
	
	public void findMissingElements() {
		int maxValue = this.arr[0];
		int minValue = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > maxValue) {
				maxValue = this.arr[i];
			}
			if(this.arr[i] < minValue){
				minValue = this.arr[i];
			}
		}
		
		int[] hashTable = new int[maxValue + 1];
		for (int i = 0; i < this.arr.length; i++) {
			hashTable[this.arr[i]] = this.arr[i];
		}
		
		this.missingElements = new int[maxValue];
		
		for (int i = minValue, k = 0; i < maxValue; i++) {
			if(hashTable[i] == 0) {
				this.missingElements[k] = i;
				k++;
			}
		}
	}
	
	public void display() {
		System.out.println("Array elements are");
		for (int value: this.missingElements) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		MissingElements obj = new MissingElements();
		obj.findMissingElements();
		obj.display();
	}
}
