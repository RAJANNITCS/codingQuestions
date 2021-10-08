package arrayProblems;

public class MergeTwoArray {
	
	public int[] arr1 = {3, 8, 16, 20, 25};
	public int[] arr2 = {4, 10, 12, 22, 23};
	
	public int[] mergeArray() {
		int[] temp = new int[this.arr1.length + this.arr2.length];
		int i = 0, j = 0, k = 0;
		
		while (i < this.arr1.length && j < this.arr2.length) {
			if (this.arr1[i] < this.arr2[j]) {
				temp[k] = this.arr1[i];
				i++;
				k++;
			}else if(this.arr2[j] < this.arr1[i]) {
				temp[k] = this.arr2[j];
				j++;
				k++;
			}else {
				temp[k] = this.arr1[i];
				i++;
				j++;
				k++;
			}
		}
		
		for ( ; i < this.arr1.length; i++) {
			temp[k] = this.arr1[i];
			k++;
		}
		for ( ; j < this.arr2.length; j++) {
			temp[k] = this.arr2[j];
			k++;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		MergeTwoArray obj = new MergeTwoArray();
		int[] tempArray = null;
		tempArray = obj.mergeArray();
		
		System.out.println("Merge array is");
		for (int value: tempArray) {
			System.out.println(value);
		}
	}
}
