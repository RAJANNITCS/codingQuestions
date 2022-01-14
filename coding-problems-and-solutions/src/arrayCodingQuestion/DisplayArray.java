package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class DisplayArray {
	public int[] arr = {2,4,6,8,10,12,14,16};
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	
	public void displayV1() {
		if (this.arr.length != 0) {
			for (int i = 0; i < this.arr.length; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public void displayV2() {
		if (this.arr1.size() != 0) {
			for (int i = 0; i < this.arr1.size(); i++) {
				System.out.println(this.arr1.get(i));
			}
		}
	}
	
	public void displayV3() {
		if (this.arr.length != 0) {
			for (int value: this.arr) {
				System.out.println(value);
			}
		}
	}
	
	public static void main(String[] args) {
		DisplayArray obj = new DisplayArray();
//		obj.displayV1();
//		obj.displayV2();
		obj.displayV3();
	}
}
