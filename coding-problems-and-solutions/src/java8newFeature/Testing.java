package java8newFeature;

import java.util.Arrays;
import java.util.Collections;

public class Testing {
	public Integer[] arr = {2,3,4,56,7,8,};
	
	public static void main(String[] args) {
		Testing obj = new Testing();
//		Collections.sort(obj.arr);
		Arrays.sort(obj.arr);
		
		for (int i = 0; i < obj.arr.length; i++) {
			System.out.println(obj.arr[i]);
		}
	}
	
}
