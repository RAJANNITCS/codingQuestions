package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindMaximumDiff {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(4,3,10,2,9,1,6));
	
	public void findMaximumDiff() {
		int num1 = 0, num2 = 0, maxDiff = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) < this.arr.get(j) && maxDiff < (this.arr.get(j) - this.arr.get(i))) {
					num1 = this.arr.get(i);
					num2 = this.arr.get(j);
					maxDiff = this.arr.get(j) - this.arr.get(i);
				}
			}
		}
		System.out.println(num1 +" + "+num2+" = "+maxDiff);
	}
	
	public static void main(String[] args) {
		FindMaximumDiff obj = new FindMaximumDiff();
		obj.findMaximumDiff();
	}
}
