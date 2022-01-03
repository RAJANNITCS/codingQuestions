//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//Input: numbers = [2,7,11,15], target = 13
//Output: [0,2]

package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;

public class FindTragateValue {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,7,11,15));
	
	public void findIndexV1(int target) {
		Hashtable<Integer,Integer> tempArr = new Hashtable<Integer, Integer>();
		int value = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			tempArr.put(i, this.arr.get(i));
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			value = target - this.arr.get(i);
			if (tempArr.containsValue(value)) {
				System.out.println(i);
			}
		}
 		
	}
	
	public void findIndexV2(int target) {
		int first = 0, last = this.arr.size() - 1;
		while (first < last) {
			int tempValue = this.arr.get(first) + this.arr.get(last);
			if (tempValue > target) {
				last--;
			}else if (tempValue < target) {
				first++;
			}else {
				System.out.println(first+ " "+ last);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindTragateValue obj = new FindTragateValue();
//		obj.findIndex(13);
		obj.findIndexV2(13);
	}
}
