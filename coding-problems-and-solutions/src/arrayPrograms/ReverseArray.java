package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16));
	
	public void reverseArray() {
		int first = 0, last = this.arr.size() - 1;
		while(first < last) {
			int temp = this.arr.get(first);
			this.arr.set(first, this.arr.get(last));
			this.arr.set(last, temp);
			first++;
			last--;
		}
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		obj.reverseArray();
		System.out.println(obj.arr);
	}
}
