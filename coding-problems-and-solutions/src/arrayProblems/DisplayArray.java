package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class DisplayArray {
	public int[] arr = {2,4,6,8,10,12,14};
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(2,4,6,8,10,12));
	
	public void displyArrayV1() {
		if (this.arr.length == 0) {
			System.out.println("Array is empty");
		}else {
			System.out.println("array elements are ");
			for (int i = 0; i < this.arr.length; i++) {
				System.out.println(this.arr[i]);
			}
		}
	}
	
	public void displayArrayV2() {
		if (this.arr1.size() == 0) {
			System.out.println("Array is empty");
		}else {
			System.out.println("Array elements are");
			for (int i = 0; i < this.arr1.size(); i++) {
				System.out.println(this.arr1.get(i));
			}
		}
	}
	
	public void displayArrayV3() {
		if (this.arr.length == 0) {
			System.out.println("Array is empty");
		}else {
			System.out.println("Array elements are");
			for (int value: this.arr) {
				System.out.println(value);
			}
		}
	}
	
	public static void main(String[] args) {
		DisplayArray obj = new DisplayArray();
//		obj.displyArrayV1();
//		obj.displayArrayV2();
		obj.displayArrayV3();
	}
}
