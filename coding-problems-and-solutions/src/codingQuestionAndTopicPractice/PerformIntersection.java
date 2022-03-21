package codingQuestionAndTopicPractice;
import java.util.ArrayList;

public class PerformIntersection {
	public int[] arr = {3,8,10,20,25};
	public int[] arr1 = {3,4,10,12,22,23};
	public ArrayList<Integer> temp = null;
	
	public void performIntersection() {
		this.temp = new ArrayList<Integer>();
		int first = 0, second = 0;
		while (this.arr.length > first && this.arr1.length > second) {
			if (this.arr[first] < this.arr1[second]) {
				first++;
			}else if (this.arr1[second] < this.arr[first]) {
				second++;
			}else {
				temp.add(this.arr[first]);
				first++;
				second++;
			}
		}
	}
	
	public static void main(String[] args) {
		PerformIntersection obj = new PerformIntersection();
		obj.performIntersection();
		System.out.println(obj.temp);
	}
}
