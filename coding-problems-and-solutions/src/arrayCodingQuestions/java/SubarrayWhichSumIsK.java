package arrayCodingQuestions.java;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;

public class SubarrayWhichSumIsK {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(5,4,6,7,9,8,3,1,2));
	public Deque<Integer> tempQue = null;
	
	public void findSubArray(int sum) {
		this.tempQue = new ArrayDeque<Integer>();
		int sumOfArr = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			if (sumOfArr < sum) {
				sumOfArr += this.arr.get(i);
				this.tempQue.addLast(this.arr.get(i));
			}else if(sumOfArr > sum){
				sumOfArr -= this.tempQue.pollFirst();
				sumOfArr += this.arr.get(i);
				this.tempQue.addLast(this.arr.get(i));
			}
		}
		System.out.println(this.tempQue);
	}
	
	public static void main(String[] args) {
		SubarrayWhichSumIsK obj = new SubarrayWhichSumIsK();
		obj.findSubArray(21);
	}
}
