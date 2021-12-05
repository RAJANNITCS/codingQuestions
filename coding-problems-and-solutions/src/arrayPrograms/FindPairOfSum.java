package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindPairOfSum {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(6, 3, 8, 10, 7, 5, 2, 9, 14));
	
	public void findPairOfSumv1(int sum) {
		int maxValue = Collections.max(this.arr);
		int bValue = 0;
		int[] ht = new int[maxValue + 1];
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			bValue = sum - this.arr.get(i);
			if (bValue > 0 &&  ht[bValue] == bValue) {
				System.out.println(this.arr.get(i)+"+"+bValue+"="+sum);
			}
		}
	}
	
	public void findPairOfSumv2(int sum) {
		int bValue = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			bValue = sum - this.arr.get(i);
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(j).equals(bValue)) {
					System.out.println(this.arr.get(i) +"+"+bValue+"="+sum);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindPairOfSum obj = new FindPairOfSum();
//		obj.findPairOfSumv1(10);
		obj.findPairOfSumv2(10);
	}
}
