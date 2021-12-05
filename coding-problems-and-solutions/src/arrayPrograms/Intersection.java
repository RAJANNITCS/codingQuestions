package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class Intersection {
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(3,8,10,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> tempArr = null;
	
	public void intersection() {
		this.tempArr  = new ArrayList<>();
		int first = 0, second = 0;
		while (first < this.arr1.size() && second < this.arr2.size()) {
			if (this.arr1.get(first) < this.arr2.get(second)) {
				first++;
			}else if (this.arr2.get(second) < this.arr1.get(first)) {
				second++;
			}else {
				this.tempArr.add(this.arr1.get(first));
				first++;
				second++;
			}
		}
	}
	
	public static void main(String[] args) {
		Intersection obj = new Intersection();
		obj.intersection();
		System.out.println(obj.tempArr);
	}
}
