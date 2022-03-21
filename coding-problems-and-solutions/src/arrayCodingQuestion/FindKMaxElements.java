package arrayCodingQuestion;
import java.util.ArrayList;

public class FindKMaxElements {
	public int[] arr = {2,4,8,10,12,14,16,18,20,22,24,26};
	public ArrayList<Integer> tempArr = null;
	
	public void findKMaxElements(int kth) {
		this.tempArr = new ArrayList<Integer>();
		int maxValue = 0;
		for (int i = 0; i <= this.arr.length - kth; i++) {
			maxValue = 0;
			for (int j = i; j < i+kth; j++) {
				if (maxValue < this.arr[j]) {
					maxValue = this.arr[j];
				}
			}
			this.tempArr.add(maxValue);
		}
	}
	
	public static void main(String[] args) {
		FindKMaxElements obj = new FindKMaxElements();
		obj.findKMaxElements(4);
		System.out.println(obj.tempArr);
	}
}
