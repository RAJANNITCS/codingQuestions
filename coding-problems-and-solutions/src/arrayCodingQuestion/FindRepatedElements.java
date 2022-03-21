package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindRepatedElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,5,6,8,10,2,12,14,16));
	
	public void findReaptedElements() {
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] += 1;
		}
		
		for (int i = 0; i <= maxValue; i++) {
			if (ht[i] == 2) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		FindRepatedElements obj = new FindRepatedElements();
		obj.findReaptedElements();
	}
}
