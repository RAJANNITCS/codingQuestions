package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FindMaxAndMinElement {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	// time complexity is (O(n)) and space complexity is (O(1))
	public int findMax() {
		int value = this.arr.get(0);
		for (int i = 1; i < this.arr.size(); i++) {
			if (value < this.arr.get(i)) {
				value = this.arr.get(i);
			}
		}
		return value;
	}
	
	// time complexity is (O(n)) and space complexity is (O(1))
	public int findMin() {
		int value = this.arr.get(0);
		for (int i = 1; i < this.arr.size(); i++) {
			if (value > this.arr.get(i)) {
				value = this.arr.get(i);
			}
		}
		return value;
	}
	
	// time complexity is (O(n)) and space complexity is (O(1))
	public void findMinAndMaxV1() {
		int minValue = this.arr.get(0);
		int maxValue = this.arr.get(0);
		for (int i = 0; i < this.arr.size(); i++) {
			if (minValue > this.arr.get(i)) {
				minValue = this.arr.get(i); 
			}
			
			if (maxValue < this.arr.get(i)) {
				maxValue = this.arr.get(i);
			}  
		}
		System.out.println("Max Value is "+ maxValue+" min value is "+minValue);
	}
	
	// using collections
	
	public void findMinAndMaxV2() {
		System.out.println("Max value is "+ Collections.max(this.arr)+ " Min value is "+ Collections.min(this.arr));
	}
	
	public static void main(String[] args) {
		FindMaxAndMinElement obj = new FindMaxAndMinElement();
		System.out.println("max value is "+ obj.findMax());
		System.out.println("min value is "+ obj.findMin());
		obj.findMinAndMaxV1();
		obj.findMinAndMaxV2();
	}
}
