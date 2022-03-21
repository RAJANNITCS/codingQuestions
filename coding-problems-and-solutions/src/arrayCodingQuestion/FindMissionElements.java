package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindMissionElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16,18,20));
	public ArrayList<Integer> missingArray = null;
	
	public void findMissionElements() {
		this.missingArray = new ArrayList<>();
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] = 1;
		}
		
		for (int i = minValue; i <= maxValue; i++) {
			if (ht[i] == 0) {
				this.missingArray.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		FindMissionElements obj = new FindMissionElements();
		obj.findMissionElements();
		System.out.println(obj.missingArray);
	}
}
