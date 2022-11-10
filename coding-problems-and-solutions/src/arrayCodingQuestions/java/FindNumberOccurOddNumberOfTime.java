package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindNumberOccurOddNumberOfTime {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,4,4,8,6,2,3,9));
	public ArrayList<Integer> tempArr = null;
	
	public void findNumer() {
		this.tempArr = new ArrayList<Integer>();
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] hashTab = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashTab[this.arr.get(i)] += 1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (hashTab[i] % 2 != 0) {
				this.tempArr.add(i);
			}
		}
		
		System.out.println(this.tempArr);
		
	}
	public static void main(String[] args) {
		FindNumberOccurOddNumberOfTime obj = new FindNumberOccurOddNumberOfTime();
		obj.findNumer();
	}
}
