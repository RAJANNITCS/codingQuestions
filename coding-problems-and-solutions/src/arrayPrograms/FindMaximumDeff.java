package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class FindMaximumDeff {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(4,3,10,2,9,1,6));
	
	public void findMaxmumDiff() {
		int maxDiff = 0;
		int first = 0;
		int second = 0;
		for (int i = 0; i < this.arr.size() - 1; i++) {
			if (this.arr.get(i) < this.arr.get(i + 1)) {
				if (maxDiff < (this.arr.get(i + 1) - this.arr.get(i))) {
					maxDiff = (this.arr.get(i+1) - this.arr.get(i));
					first = this.arr.get(i);
					second = this.arr.get(i+1);
				}
			}
		}
		System.out.println(second+"-"+first+"="+maxDiff);
	}
	
	public static void main(String[] args) {
		FindMaximumDeff obj = new FindMaximumDeff();
		obj.findMaxmumDiff();
	}
}