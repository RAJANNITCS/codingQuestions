package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindNumberOccureOddNumberOfTime {
	public ArrayList<Integer> arr = new ArrayList(List.of(2,4,6,8,4,4,8,6,2,3,9));
	
	public void findNumberOccureOddNumberOfTime() {
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] += 1;
		}
		
		for (int i = 0; i <= maxValue; i++) {
			if (ht[i] % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		FindNumberOccureOddNumberOfTime obj = new FindNumberOccureOddNumberOfTime();
		obj.findNumberOccureOddNumberOfTime();
	}
}
