package collectionInjava;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class ListInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<>(List.of(2,4,6,8,10,12,14));
		List<Integer> arr2 = new LinkedList<>(List.of(3,6,9,10,12,14,15));
		List<Integer> arr3 = new Stack<>();
		List<Integer> arr4 = new Vector<>(List.of(4,8,12,14,18,20));
		
		System.out.println(arr4.getClass().getName());
		System.out.println(arr2);
	}
}
