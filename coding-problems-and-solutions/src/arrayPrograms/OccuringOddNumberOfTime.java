package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OccuringOddNumberOfTime {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,4,4,8,6,2,3,9));
	
	public void occuringOddNumberOfTime() {
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] +=1;
		}
		
		for (int i = minValue; i <= maxValue ; i++) {
			if (ht[i] % 2 != 0) {
				System.out.println("value is = "+ i);
				System.out.println("number of time occuring = "+ht[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		OccuringOddNumberOfTime obj = new OccuringOddNumberOfTime();
		obj.occuringOddNumberOfTime();
	}
}
