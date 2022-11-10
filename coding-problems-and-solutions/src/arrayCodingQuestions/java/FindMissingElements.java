package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindMissingElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16));
	public ArrayList<Integer> missingTemp = null;
	
	public void findMissingElements() {
		this.missingTemp = new ArrayList<Integer>();
		
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] hashTab = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			hashTab[this.arr.get(i)] += 1;
		}
		for (int i = minValue; i <= maxValue; i++) {
			if (hashTab[i] == 0) {
				this.missingTemp.add(i);
			}
		}
		System.out.println(this.missingTemp);
	}
	
	public static void main(String[] args) {
		FindMissingElements obj = new FindMissingElements();
		obj.findMissingElements();
	}
}
