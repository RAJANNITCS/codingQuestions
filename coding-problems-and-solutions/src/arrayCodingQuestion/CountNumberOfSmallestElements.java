package arrayCodingQuestion;
import java.util.ArrayList;

public class CountNumberOfSmallestElements {
	public int[] arr = {10,3,4,5,7,1,3,2};
	public ArrayList<Integer> tempArr = null;
	
	public void countNumberOfSmallestElements() {
		this.tempArr = new ArrayList<Integer>();
		int count;
		for (int i = 0; i < this.arr.length - 1; i++) {
			count = 0;
			for (int j = i+1 ; j < this.arr.length; j++) {
				if (this.arr[i] > this.arr[j]) {
					count++;
				}
			}
			this.tempArr.add(count);
		}
	}
	
	public static void main(String[] args) {
		CountNumberOfSmallestElements obj = new CountNumberOfSmallestElements();
		obj.countNumberOfSmallestElements();
		System.out.println(obj.tempArr);
	}
}
