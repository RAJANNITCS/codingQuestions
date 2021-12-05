package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	public int binarySearch(int value) {
		int tempIndex = -1;
		int first = 0, last = this.arr.size();
		int mid = 0;
		while (first <= last) {
			mid = ((first + last) / 2);
			if (this.arr.get(mid).equals(value)) {
				tempIndex = mid;
				break;
			}else if (this.arr.get(mid) < value) {
				first  = mid + 1;
			}else {
				last = mid - 1;
			}
		}
		
		return tempIndex;
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		System.out.println("position of 10 = " + obj.binarySearch(10));
	}
}
