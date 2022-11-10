package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindEquilibriumIndex {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10,5,15,3,4,21,2));
	
	public void findEquilibriumIndex() {
		int first = 0, rear = this.arr.size() - 1;
		int sum1 = this.arr.get(first), sum2 = this.arr.get(rear);
		
		while (first < rear) {
			if (sum1 < sum2) {
				first++;
				sum1 += this.arr.get(first);
			}else if (sum1 > sum2){
				rear--;
				sum2 += this.arr.get(rear);
			}else {
				break;
			}
		}
		
		System.out.println("index is " + first);
	}
	
	public static void main(String[] args) {
		FindEquilibriumIndex obj = new FindEquilibriumIndex();
		obj.findEquilibriumIndex();
	}
}
