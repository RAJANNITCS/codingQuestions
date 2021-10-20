package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;
import java.util.Collections;

public class ThreeElementsSum {
	ArrayList<Integer> arr = new ArrayList<>(List.of(6,9,1,4,2,7));
	
	public void findThreeElementsSumV1(int sum) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			ht.put(this.arr.get(i), this.arr.get(i));
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				int tempValue = sum - (this.arr.get(i) + this.arr.get(j));
				if (ht.containsKey(tempValue)) {
					System.out.println(this.arr.get(i)+"+"+this.arr.get(j)+"+"+tempValue+"="+(
							this.arr.get(i)+this.arr.get(j)+tempValue));
					if (sum == (this.arr.get(i)+this.arr.get(j)+tempValue)) {
						return;
					}
				}
			}
		}
	}
	
	public void findTreeElementsSumV2(int sum) {
		Collections.sort(this.arr);
		int first = 0, last = this.arr.size() - 1;
		int sumOfValue = 0;
		for (int i = 0; i < this.arr.size() - 2; i++) {
			first = i + 1;
			while (first < last) {
				sumOfValue = this.arr.get(i) + this.arr.get(first) + this.arr.get(last);
				if (sumOfValue > sum) {
					last--;
				}else if (sumOfValue < sum) {
					first++;
				}else {
					break;
				}
			}
			System.out.println(this.arr.get(i)+"+"+this.arr.get(first)+"+"+this.arr.get(last)+"="+sumOfValue);
			if (this.arr.get(i) + this.arr.get(first) + this.arr.get(last) == sum) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ThreeElementsSum obj = new ThreeElementsSum();
//		obj.findThreeElementsSum(7);
		obj.findTreeElementsSumV2(7);
	}
	
}
