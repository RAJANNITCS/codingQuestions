package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindDuplicateElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,6,7,8,8,11,11,12,12,12));
	public ArrayList<Integer> temp = null;
	
	public void findDuplicate() {
		this.temp = new ArrayList<Integer>();
		int maxValue = Collections.max(this.arr);
		int minValue = Collections.min(this.arr);
		
		int[] hashtab = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashtab[this.arr.get(i)] += 1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (hashtab[i] > 1) {
				this.temp.add(i);
			}
		}
		System.out.println(this.temp);
	}
	
	public static void main(String[] args) {
		FindDuplicateElements obj = new FindDuplicateElements();
		obj.findDuplicate();
	}
}
