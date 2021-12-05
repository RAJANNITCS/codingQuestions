package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindClosestToZero {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(-2,9,6,1,2,-5));
	
	public void findClosestToZero() {
		Collections.sort(this.arr);
		int first = 0, last = this.arr.size() - 1;
		while (first < last) {
			int sum = (this.arr.get(first) + this.arr.get(last));
			if (sum < 0) {
				first++;
			}else if (sum > 0) {
				last--;
			}else {
				break;
			}
		}
		System.out.println(this.arr.get(first)+"+"+this.arr.get(last)+"=" +
		(this.arr.get(first) + this.arr.get(last)));
	}
	
	public static void main(String[] args) {
		FindClosestToZero obj = new FindClosestToZero();
		obj.findClosestToZero();
	}
}

