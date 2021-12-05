package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class FindOneIndexPoint {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(0,0,0,0,0,0,0,0,0,0,0,0
			,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
	
	public void findOneIndexPoint() {
		int first = 0, last = 10;
		while (first < last) {
			if (this.arr.get(first).equals(1)) {
				System.out.println(first);
				break;
			}else {
				if (first != (last - 1)) {
					first++;
				}else {
					first = last;
					last += 10;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindOneIndexPoint obj = new FindOneIndexPoint();
		obj.findOneIndexPoint();
	}
}
