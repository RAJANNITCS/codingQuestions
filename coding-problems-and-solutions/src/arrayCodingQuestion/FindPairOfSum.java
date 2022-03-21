package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindPairOfSum {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(6,3,8,10,7,5,2,9,14));
	
	public void findPairOfSum(int sum) {
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			int value = sum - this.arr.get(i);
			if (ht[value] == value) {
				System.out.println(this.arr.get(i)+"+"+ value +"="+sum);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FindPairOfSum obj = new FindPairOfSum();
		obj.findPairOfSum(10);
	}
}
