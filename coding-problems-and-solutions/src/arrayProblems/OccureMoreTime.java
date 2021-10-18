package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class OccureMoreTime {
	
	ArrayList<Integer> arr = new ArrayList<>(List.of(2,3,3,3,3,3,3,4,6));
	
	public int findElemenetV1() {
		Integer temp = 0;
		Integer count = 0;
		
		for (int i = 0; i < this.arr.size() - 1; i++) {
			if (this.arr.get(i) == this.arr.get(i + 1)) {
				temp = this.arr.get(i);
				count++;
			}else {
				if (count > this.arr.size() / 2) {
					return temp;
				}
				temp = 0;
				count = 0;
			}
		}
		
		return -1;
	}
	
	public int findElementV2() {
		
		for (int i = 0; i < this.arr.size(); i++) {
			if (this.arr.get(i + ((this.arr.size() / 2) + 1)) != null && this.arr.get(i) == this.arr.get(i + ((this.arr.size() / 2) + 1))) {
				return this.arr.get(i);
			}
		} 
		return -1;
	}
	
	public static void main(String[] args) {
		OccureMoreTime obj = new OccureMoreTime();
		System.out.println("find value is =" + obj.findElementV2());
	}
	
}
