package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindMaximumElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16,18,20,22,24,26));
	public ArrayList<Integer> tempArr = null;
	
	public void findMaximumElements(int k) {
		this.tempArr = new ArrayList<Integer>();
		int maxValue;
		for (int i = 0; i <= this.arr.size() - k; i++) {
			maxValue = 0;
			for (int j = i; j < i+k; j++) {
				if (maxValue < this.arr.get(j)) {
					maxValue = this.arr.get(j);
				}
			}
			this.tempArr.add(maxValue);
		}
		System.out.println(this.tempArr);
	}
	
	public static void main(String[] args) {
		FindMaximumElements obj = new FindMaximumElements();
		obj.findMaximumElements(4);
	}
}
