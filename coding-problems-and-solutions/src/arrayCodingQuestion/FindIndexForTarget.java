package arrayCodingQuestion;

public class FindIndexForTarget {
	public int[] arr = {2,7,11,15};
	
	public void findIndexForTarget(int targetValue) {
		int first = 0, last = this.arr.length - 1;
		while (first < last) {
			if (this.arr[first] + this.arr[last] < targetValue) {
				first++;
			}else if (this.arr[first] + this.arr[last] > targetValue) {
				last--;
			}else {
				break;
			}
		}
		System.out.println(first+" "+last);
	}
	
	public static void main(String[] args) {
		FindIndexForTarget obj = new FindIndexForTarget();
		obj.findIndexForTarget(13);
	}
}
