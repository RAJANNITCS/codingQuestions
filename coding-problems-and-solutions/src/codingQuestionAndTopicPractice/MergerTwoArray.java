package codingQuestionAndTopicPractice;
import java.util.ArrayList;

public class MergerTwoArray {
	public int[] arr = {3,8,16,20,25};
	public int[] arr1 = {4,10,12,22,23};
	public ArrayList<Integer> temp = null;
	
	public void mergeTwoArray() {
		int first = 0, second = 0;
		this.temp = new ArrayList<Integer>();
		while (this.arr.length > first && this.arr1.length > second) {
			if (this.arr[first] < this.arr1[second]) {
				temp.add(this.arr[first]);
				first++;
			}else if(this.arr1[second] < this.arr[first]) {
				temp.add(this.arr1[second]);
				second++;
			}else {
				temp.add(this.arr[first]);
				temp.add(this.arr1[second]);
				first++;
				second++;
			}
		}
		for (; first < this.arr.length; first++) {
			temp.add(this.arr[first]);
		}
		
		for (; second < this.arr1.length; second++) {
			temp.add(this.arr1[second]);
		}
	}
	
	public static void main(String[] args) {
		MergerTwoArray obj = new MergerTwoArray();
		obj.mergeTwoArray();
		System.out.println(obj.temp);
	}
}
