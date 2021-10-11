package collectionsFrameworkProblems;
import java.util.ArrayList;

public class ListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(20);
		arr.add(10);
		arr.add(20);
		
		for(Integer value: arr) {
			System.out.println(value);
		}
	}
}
