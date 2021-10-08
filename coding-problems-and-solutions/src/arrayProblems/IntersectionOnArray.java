package arrayProblems;

public class IntersectionOnArray {
	
	public int[] arr1 = {3, 5, 10, 4, 6};
	public int[] arr2 = {12, 4, 7, 2, 5};
	public int[] tempArr = null;
	
	public void intersectionOpration() {
		this.tempArr = new int[this.arr1.length + this.arr2.length];
		int maxValue = this.arr1[0];
		
		for (int i = 0; i < this.arr1.length; i++) {
			if (this.arr1[i] > maxValue) {
				maxValue = this.arr1[i];
			}
		}
		
		for (int i = 0; i < this.arr2.length; i++) {
			if (maxValue < this.arr2[i]) {
				maxValue = this.arr2[i];
			}
		}
		
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr1.length; i++) {
			hashTable[this.arr1[i]] += 1;
		}
		
		for (int i = 0; i < this.arr2.length; i++) {
			hashTable[this.arr2[i]] += 1;
		}
		
		for (int i = 0,k = 0; i < hashTable.length; i++) {
			if (hashTable[i] > 1) {
				this.tempArr[k] = i;
			}
		}
	}
	
	public void displayArr() {
		for (int value: this.tempArr) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		IntersectionOnArray obj = new IntersectionOnArray();
		obj.intersectionOpration();
		obj.displayArr();
	}
}
