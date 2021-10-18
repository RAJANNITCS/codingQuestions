package collectionInjava;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListClassDemo {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		LinkedList<Integer> arr1 = new LinkedList<>();
		LinkedList<Integer> arr3 = new LinkedList<>(List.of(2,4,6,8,10,12,10,14));
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
