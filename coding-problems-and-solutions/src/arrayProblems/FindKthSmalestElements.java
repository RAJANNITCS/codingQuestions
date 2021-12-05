package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class FindKthSmalestElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(8,2,3,9,22,10,12));
	public int[] arr1 = {8,2,3,9,22,10,12};
	
	public Integer findKthSmallestElment(int kthPositon) {
		Collections.sort(this.arr);
		return this.arr.get(kthPositon - 1);
	}
	
	public Integer findkthlargestElement(int kthPosition) {
		Collections.reverse(this.arr);
		return this.arr.get(kthPosition - 1);
	}
	
	public int findKthSmallestElementInt(int kthPosition) {
		Arrays.sort(this.arr1);
		return this.arr1[kthPosition - 1];
	}
	
	public int findKthLargestElementsInt(int kthPosition) {
		Arrays.sort(this.arr1);
		for (int i = 0, j = this.arr1.length - 1; i <= j; i++,j--) {
			int temp = this.arr1[i];
			this.arr1[i] = this.arr1[j];
			this.arr1[j] = temp;
		}
		
		return this.arr1[kthPosition - 1];
	}
	
	public static void main(String[] args) {
		FindKthSmalestElements obj = new FindKthSmalestElements();
		System.out.println("kth smallest elements is " + obj.findKthSmallestElment(3));
		System.out.println("kth largest elements is " + obj.findkthlargestElement(3));
		System.out.println("kth smallest elements is " + obj.findKthSmallestElementInt(3));
		System.out.println("kth largest elements is " + obj.findKthLargestElementsInt(3));
	}
}
