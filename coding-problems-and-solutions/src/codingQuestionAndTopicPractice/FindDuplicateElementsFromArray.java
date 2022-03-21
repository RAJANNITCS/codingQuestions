package codingQuestionAndTopicPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindDuplicateElementsFromArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,6,8,12,12,14,14,16));
	
	public void findDuplicateElements() {
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] ht  = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] += 1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (ht[i] > 1) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		FindDuplicateElementsFromArray obj = new FindDuplicateElementsFromArray();
		obj.findDuplicateElements();
	}
}
