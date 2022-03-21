package arrayCodingQuestion;

public class FindEquilibriumIndex {
	public int[] arr = {10,5,15,3,4,21,2};
	
	public void findEquilibriumIndex() {
		int first = 0, last = this.arr.length - 1;
		int sum1 = this.arr[first];
		int sum2 = this.arr[last];
		while (first < last) {
			if (sum1 < sum2) {
				first++;
				sum1 += this.arr[first];
			}else if (sum1 > sum2) {
				last--;
				sum2 += this.arr[last];
			}else {
				break;
			}
		}
		System.out.println(first);
	}
	
	public static void main(String[] args) {
		FindEquilibriumIndex obj = new FindEquilibriumIndex();
		obj.findEquilibriumIndex();
	}
}
