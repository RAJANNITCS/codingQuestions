package arrayProblems;
import java.util.ArrayList;
import java.util.List;


public class FindEquilibriumIndex {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10,5,15,3,4,21,2));
	
	public void findEquilibriumIndex() {
		int first = 0, last = this.arr.size() - 1;
		int firstSum = this.arr.get(0), lastSum = this.arr.get(last);
		while (first < last) {
			if (firstSum < lastSum) {
				firstSum += this.arr.get(first + 1);
				first++;
			}else if(firstSum > lastSum) {
				lastSum += this.arr.get(last - 1);
				last--;
			}else {
				break;
			}
		}
		System.out.println(first);
	}

	public static void main(String[] args) {
		FindEquilibriumIndex obj = new FindEquilibriumIndex();
		obj.findEquilibriumIndex();
	}
}
