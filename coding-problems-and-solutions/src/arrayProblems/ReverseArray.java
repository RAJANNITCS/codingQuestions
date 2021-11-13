package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14));
	
	// time is (O(n)) and space (O(n))
	public void reverseArrayV1() {
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for (int i = this.arr.size() - 1; i >= 0; i--) {
			tempArr.add(this.arr.get(i));
		}
		for (int i = 0; i < this.arr.size(); i++) {
			this.arr.set(i, tempArr.get(i));
		}
		System.out.println(this.arr);
	}
	
	// time is (O(n) and space (O(1))
	public void reverseArrayV2() {
		for (int i = 0, last = this.arr.size() - 1; i < last; i++,last--) {
			int temp = this.arr.get(i);
			this.arr.set(i, this.arr.get(last));
			this.arr.set(last, temp);
		}
		System.out.println(this.arr);
	}
	
	// time is (
	public void reverseArrayV3() {
		Collections.reverse(this.arr);
		System.out.println(this.arr);
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
//		obj.reverseArrayV1();
//		obj.reverseArrayV2();
		obj.reverseArrayV3();
	}
}
