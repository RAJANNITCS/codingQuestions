package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class SubArraySumGivenValue {
	public int[] arr = {5,4,6,7,9,8,3,1,2};
	
	public void subArraySumGivenValue(int sum) {
		ArrayList<Integer> subArr = new ArrayList<>();
		int first = 0, second = 0;
		int valueSum = 0;
		while (second < this.arr.length) {
			if (valueSum < sum) {
				valueSum += this.arr[second];
				second++;
			}else if(valueSum > sum){
				valueSum -= this.arr[first];
				first++;
			}else {
				break;
			}
		}
		while (first < second) {
			subArr.add(this.arr[first]);
			first++;
		}
		System.out.println(subArr);
	}
	
	public void subArraySumGivenValueUsingDQue(int sum) {
		ArrayDeque<Integer> tempArr = new ArrayDeque<Integer>();
		int valueSum = 0;
		for (int i = 0; i< this.arr.length; i++) {
			if (valueSum < sum) {
				tempArr.addLast(this.arr[i]);;
				valueSum += this.arr[i];
			}else if(valueSum > sum) {
				valueSum -= tempArr.pollFirst();
				valueSum += this.arr[i];
				tempArr.addLast(this.arr[i]);
			}else {
				break;
			}
		}
		
		System.out.println(tempArr);
	}
	
	public static void main(String[] args) {
		SubArraySumGivenValue obj = new SubArraySumGivenValue();
		obj.subArraySumGivenValue(21);
		obj.subArraySumGivenValueUsingDQue(21);
	}
}
