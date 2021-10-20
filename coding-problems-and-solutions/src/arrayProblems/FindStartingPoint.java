package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class FindStartingPoint {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
	
	public void findStartingPoint() {
		int first = 0, last = 10;
		while (first <= last) {
			if (this.arr.get(first).equals(1)) {
				break;
			}
			if (first == last - 1) {
				first = last;
				last = last + 10;
			}
			first++;
		}
		
		System.out.println("1's starting point is ="+first);
		
	}
	
	public static void main(String[] args) {
		FindStartingPoint obj = new FindStartingPoint();
		obj.findStartingPoint();
	}
}
  