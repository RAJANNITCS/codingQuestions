package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindKthLargestAndkthSmallestEle {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(4,2,8,6,10,16,14,20,18,17));
	
	public int findKthLargestElement(int k) {
		Collections.sort(this.arr);
		return (this.arr.get(this.arr.size() - k));
	}
	
	public int findKthSmallestElemet(int k) {
		Collections.sort(this.arr);
		return (this.arr.get(k - 1));
	}
	
	public int findKthLargestElementV1(int k) {
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size();j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					int temp = this.arr.get(i);
					this.arr.set(i,this.arr.get(j));
					this.arr.set(j,temp);
				}
			}
		}
		System.out.println(this.arr);
		return (this.arr.get(this.arr.size() - k));
	}
	
	public int findKthSmallestElementsV1(int k) {
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					int temp = this.arr.get(i);
					this.arr.set(i,this.arr.get(j));
					this.arr.set(j, temp);
				}
			}
		}
		
		return (this.arr.get(k - 1));
	}
	
	public static void main(String[] args) {
		FindKthLargestAndkthSmallestEle obj = new FindKthLargestAndkthSmallestEle();
//		System.out.println(obj.findKthLargestElement(2));
//		System.out.println(obj.findKthSmallestElemet(2));
//		System.out.println(obj.findKthLargestElementV1(2));
		System.out.println(obj.findKthSmallestElementsV1(2));
	}
}
