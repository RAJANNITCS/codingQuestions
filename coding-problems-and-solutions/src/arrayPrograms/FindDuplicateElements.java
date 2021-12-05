package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindDuplicateElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,6,8,12,14,14,16));
	public ArrayList<Integer> tempArr = null;
	
	public void findDuplicate() {
		this.tempArr = new ArrayList<Integer>();
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] hb = new int[maxValue + 1];
				
		for (int i = 0; i < this.arr.size(); i++) {
			hb[this.arr.get(i)] +=1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (hb[i] >= 2) {
				this.tempArr.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		FindDuplicateElements obj = new FindDuplicateElements();
		obj.findDuplicate();
		System.out.println(obj.tempArr);
	}
}
