package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OccureOddNumberOfTime {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,4,4,8,6,2,3,9));
	
	public void occureOddNumberOfTime() {
		int maxValue = Collections.max(this.arr);
		int minValue = Collections.min(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for(int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] += 1;
		}
		
		for (int i = minValue ; i <= maxValue; i++) {
			if (ht[i] % 2 != 0) {
				System.out.println("value "+ i + " number of time "+ht[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		OccureOddNumberOfTime obj = new OccureOddNumberOfTime();
		obj.occureOddNumberOfTime();
	}
}
