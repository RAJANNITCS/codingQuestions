package arrayPrograms;
import java.util.ArrayList;
import java.util.List;


public class WapDisplayArray {
	
	public int[] arr = {2,4,6,8,10,12,14};
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16));
	
	public static void main(String[] args) {
		WapDisplayArray obj = new WapDisplayArray();
		System.out.println("Array elements are");
//		for (int i = 0; i < obj.arr.length; i++) {
//			System.out.println(obj.arr[i]);
//		}
		
//		for (int value: obj.arr) {
//			System.out.println(value);
//		}
//		
//		System.out.println(obj.arr1);
//		for (int i = 0; i < obj.arr1.size(); i++) {
//			System.out.println(obj.arr1.get(i));
//		}
		
		for (Integer value : obj.arr1) {
			System.out.println(value);
		}
	}
}
