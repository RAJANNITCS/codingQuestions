package collectionInjava;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;
import java.util.Iterator;


public class IteratorInterfaceDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14));
		LinkedList<Integer> arr1 = new LinkedList<>(List.of(2,4,6,8,10,12,14));
		Stack<Integer> arr2 = new Stack<>();
		Vector<Integer> arr3 = new Vector<>(List.of(2,4,6,8,10,12,14));
		arr2.push(3);
		arr2.push(6);
		arr2.push(8);
		System.out.println(arr);
		Iterator<Integer> itr = arr3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
