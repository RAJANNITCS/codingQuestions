package arrayProblems;

public class UnionOperation {
	
	public int[] arr1 = {3, 5, 10, 4, 6};
	public int[] arr2 = {12, 4, 7, 2, 5};
	public int[] tempArr = null;
	
	public void findUnionV1() {
		this.tempArr = new int[this.arr1.length + this.arr2.length];
		int k = 0;
		for (int i = 0; i < this.arr1.length; i++,k++) {
			this.tempArr[k] = this.arr1[i];
		}
		
		for (int j = 0; j < this.arr2.length; j++) {
			boolean isValuePre = true;
			for (int i = 0; i < k; i++) {
				if (this.arr2[j] == this.tempArr[i]) {
					isValuePre = false;
				}
			}
			if (isValuePre) {
				this.tempArr[k] = this.arr2[j];
				k++;
			}
		}
	}
	
	public void findUnionV2() {
		this.tempArr = new int[this.arr1.length + this.arr2.length];
		int maxValue = this.arr1[0];
		
		for (int i = 0; i < this.arr1.length; i++) {
			if (this.arr1[i] > maxValue) {
				maxValue = this.arr1[i];
			}
		}
		for (int i = 0; i < this.arr2.length; i++) {
			if (this.arr2[i] > maxValue) {
				maxValue = this.arr2[i];
			}
		}
		
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr1.length; i++) {
			hashTable[this.arr1[i]] = this.arr1[i];
		}
		
		for (int i = 0; i < this.arr2.length; i++) {
			hashTable[this.arr2[i]] = this.arr2[i];
		}
		
		for (int i = 0,j = 0; i < hashTable.length; i++) {
			if (hashTable[i] > 0) {
				this.tempArr[j] = hashTable[i];
				j++;
			}
		}
	}
	
	public void display() {
		System.out.println("Union Array is");
		for (int value: this.tempArr) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		UnionOperation obj = new UnionOperation();
//		obj.findUnionV1();
//		obj.display();
		
		obj.findUnionV2();
		obj.display();
		
	}

}
