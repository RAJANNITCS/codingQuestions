package synchronizationInJava;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
