package arrayCodingQuestion;
import java.util.ArrayDeque;

public class SumOfEqualsToValue {
	public int[] arr = {5, 4, 6, 7, 9, 8, 3, 1,	2};
	public ArrayDeque<Integer> tempArr = null;
	
	public void sumOfEqualsToValue(int sum) {
		this.tempArr = new ArrayDeque<Integer>();
		int sumOfValue = 0;
		for (int i = 0; i < this.arr.length; i++) {
			if (sumOfValue < sum) {
				this.tempArr.addLast(this.arr[i]);
				sumOfValue += this.arr[i];
			}else if (sumOfValue > sum){
				sumOfValue -= this.tempArr.pollFirst();
				this.tempArr.addLast(this.arr[i]);
				sumOfValue += this.arr[i];
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		SumOfEqualsToValue obj = new SumOfEqualsToValue();
		obj.sumOfEqualsToValue(21);
		System.out.println(obj.tempArr);
	}
}
