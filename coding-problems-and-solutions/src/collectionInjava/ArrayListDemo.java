package collectionInjava;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ArrayListDemo {
	
	public static void show(Integer n) {
		if (n > 6) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>(20);
		ArrayList<Integer> arr3 = new ArrayList<>(List.of(2,4,6,8,10,12,10,14));
		arr.add(2);
		arr.add(4);
		arr.addAll(arr3);
		arr.add(2,22);
		System.out.println(arr);
//		arr.forEach(n->System.out.println(n));
//		arr.forEach(System.out :: println);
//		arr.forEach(n->show(n));
		
//		System.out.println(arr.contains(10));
//		System.out.println(arr.get(7));
//		System.out.println(arr.indexOf(10));
//		System.out.println(arr.lastIndexOf(10));
		
//		for(int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
//		for (Integer value:arr) {
//			System.out.println(value);
//		}
		
//		for (Iterator<Integer> it = arr.iterator(); it.hasNext();) {
//			System.out.println(it.next());
//		}
		
//		arr.forEach((value)->{
//			System.out.println(value);
//		});
		
		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
