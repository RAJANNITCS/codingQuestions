package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class FindMaxDiff {
	
	ArrayList<Integer> arr = new ArrayList<>(List.of(4,3,10,2,9,1,6));
	
	public void findMaxDiffV1() {
		Integer maxDiff = 0;
		Integer value1 = 0;
		Integer value2 = 0;
		
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i; j < this.arr.size(); j++) {
				if (this.arr.get(i) < this.arr.get(j)) {
					if (maxDiff < (this.arr.get(j) - this.arr.get(i))) {
						maxDiff = (this.arr.get(j) - this.arr.get(i));
						value1 = this.arr.get(i);
						value2 = this.arr.get(j);
					}
				}
			}
		}
		System.out.println(value1 +","+ value2 + "= "+ (value2 - value1));
	}
	
	public static void main(String[] args) {
		FindMaxDiff obj = new FindMaxDiff();
		obj.findMaxDiffV1();
	}
}
