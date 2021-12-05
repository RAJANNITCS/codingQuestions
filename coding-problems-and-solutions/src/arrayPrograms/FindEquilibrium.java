package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class FindEquilibrium {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10,5,15,3,4,21,2));
	
	public void findEquilibrium() {
		int first = 0, last = this.arr.size() - 1;
		int sum1 = this.arr.get(0), sum2 = this.arr.get(last);
		while (first < last) {
			if (sum1 < sum2) {
				sum1 += this.arr.get(first + 1);
				first++;
			}else if (sum1 > sum2){
				sum2 += this.arr.get(last -1);
				last--;
			}else {
				System.out.println("sum1 ="+ sum1+ "sum2 "+sum2);
				System.out.println(first);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindEquilibrium obj = new FindEquilibrium();
		obj.findEquilibrium();
	}
}
