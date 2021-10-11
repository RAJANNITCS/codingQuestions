package arrayProblems;

public class FindPair {
	
	public int[] arr = {6, 3, 8, 10, 7, 5, 2, 9, 14};
	
	
	public void findPairOfSum(int sum) {
		int maxValue = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > maxValue) {
				maxValue = this.arr[i];
			}
		}
		
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.length; i++) {
			hashTable[this.arr[i]] += 1;
		}
		
		for (int i = 0; i < this.arr.length; i++) {
			int tempValue = 0;
			tempValue = sum - this.arr[i];
			if (tempValue > 0 && (hashTable[tempValue] >= 1)) {
				System.out.println("a = "+ this.arr[i]);
				System.out.println("b = "+ tempValue);
				System.out.println("sum = "+ sum);
			}
		}
	}
	
	public static void main(String[] args) {
		FindPair obj = new FindPair();
		obj.findPairOfSum(10);
	}

}
