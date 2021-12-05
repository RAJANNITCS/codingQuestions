package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ThreeSumOfEement {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(6,9,1,4,2,7));
	
	public void threeSumOfElement(int sum) {
		int maxValue = Collections.max(this.arr);
		
		int[] hashTable1 = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			hashTable1[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i+1; j < this.arr.size(); j++) {
				int value = sum - (this.arr.get(i) + this.arr.get(j));
				if (value > 0 && hashTable1[value] == value) {
					System.out.println(this.arr.get(i) +"+"+this.arr.get(j)+"+"+value+"="+
							sum);
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreeSumOfEement obj = new ThreeSumOfEement();
		obj.threeSumOfElement(7);
	}
}
