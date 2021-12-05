package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class findMissingElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,15));
	public ArrayList<Integer> tempArr = null;
 	
	public void findMissingElement() {
		this.tempArr = new ArrayList<>();
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] hb = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			hb[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (hb[i] == 0) {
				this.tempArr.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		findMissingElements obj = new findMissingElements();
		obj.findMissingElement();
		System.out.println(obj.tempArr);
	}
}
