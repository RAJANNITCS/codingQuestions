package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindIndexOfTargetSum {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,7,11,15));
	public ArrayList<Integer> tempArr = null;
	
	public void findIndexOfTargetSum(int targetValue) {
		this.tempArr = new ArrayList<Integer>();
		int first = 0, rear = this.arr.size() - 1;
		
		while (first < rear) {
			if ((this.arr.get(first) + this.arr.get(rear)) < targetValue) {
				first++;
			}else if ((this.arr.get(first) + this.arr.get(rear)) > targetValue) {
				rear--;
			}else {
				break;
			}
		}
		this.tempArr.add(first);
		this.tempArr.add(rear);
	}
	public static void main(String[] args) {
		FindIndexOfTargetSum obj = new FindIndexOfTargetSum();
		obj.findIndexOfTargetSum(13);
		System.out.println(obj.tempArr);
	}
}
