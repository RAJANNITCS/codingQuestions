package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindKthSmallestAndKthLargest {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(4,2,8,6,10,16,14,20,18,17));
	
	public void findKthSmallest(int kth) {
		Collections.sort(this.arr);
		System.out.println(this.arr.get(kth - 1));
	}
	
	public void findKthLargestElements(int kth) {
		Collections.sort(this.arr);
		Collections.reverse(this.arr);
		System.out.println(this.arr.get(kth - 1));
	}
	
	public void findKthSmallestV2(int kth) {
		
		for (int i = 0; i < this.arr.size() - 1; i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					int temp = this.arr.get(i);
					this.arr.set(i, this.arr.get(j));
					this.arr.set(j, temp);
				}
			}
		}
		
		System.out.println(this.arr.get(kth - 1));
	}
	
	public void findKthLargestV2(int kth) {
		for (int i = 0; i < this.arr.size() - 1; i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					int temp = this.arr.get(i);
					this.arr.set(i,this.arr.get(j));
					this.arr.set(j,temp);
				}
			}
		}
		
		int first = 0, last = this.arr.size() - 1;
		while (first < last) {
			int temp = this.arr.get(first);
			this.arr.set(first, this.arr.get(last));
			this.arr.set(last,temp);
			first++;
			last--;
		}
		
		System.out.println(this.arr.get(kth - 1));
	}
	
	public static void main(String[] args) {
		FindKthSmallestAndKthLargest obj = new FindKthSmallestAndKthLargest();
//		obj.findKthSmallest(2);
//		obj.findKthLargestElements(2);
//		obj.findKthSmallestV2(2);
//		System.out.println(obj.arr);
		obj.findKthLargestV2(2);
	}
}
