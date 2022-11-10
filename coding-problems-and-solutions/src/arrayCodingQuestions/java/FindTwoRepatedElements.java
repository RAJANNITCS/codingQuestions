package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindTwoRepatedElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,5,6,8,10,2,12,5,16));
	public ArrayList<Integer> tempArr = null;
	
	public void findTwoRepatedElements() {
		this.tempArr = new ArrayList<Integer>();
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] hashTab = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashTab[this.arr.get(i)] += 1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (hashTab[i] == 2) {
				this.tempArr.add(i);
			}
		}
		System.out.println(this.tempArr);
	}
	
	public static void main(String[] args) {
		FindTwoRepatedElements obj = new FindTwoRepatedElements();
		obj.findTwoRepatedElements();
	}
}
