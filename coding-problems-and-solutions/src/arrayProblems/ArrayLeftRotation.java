package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {
	
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14));
	
	public static void rotateArray(ArrayLeftRotation obj,int num) {
		int j = 0;
		while (j < num) {
			int tempValue = obj.arr.get(0);
			for (int i = 0; i < obj.arr.size() - 1; i++) {
				obj.arr.set(i, obj.arr.get(i + 1));
			}
			obj.arr.set(obj.arr.size() - 1, tempValue);
			j++;
		}
		
		System.out.println(obj.arr);
	}
	
	public static void rotateArray(ArrayLeftRotation obj) {
		int tempValue = obj.arr.get(0);
		for (int i = 0; i < obj.arr.size() - 1; i++) {
			obj.arr.set(i, obj.arr.get(i + 1));
		}
		obj.arr.set(obj.arr.size() - 1, tempValue);
		System.out.println(obj.arr);
	}
	
	public static void main(String[] args) {
		ArrayLeftRotation obj = new ArrayLeftRotation();
		rotateArray(obj,2);
	}
}
