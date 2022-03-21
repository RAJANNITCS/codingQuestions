package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ThreeSum {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(6,9,1,4,2,7));
	
	public void threeSum(int sum) {
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				int findValue = sum - (this.arr.get(i) + this.arr.get(j));
				if (findValue > 0 && ht[findValue] == findValue) {
					System.out.println(this.arr.get(i)+" "+this.arr.get(j)+" "+findValue);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		obj.threeSum(7);
	}
}
