package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindElementsWhoseSum {
	ArrayList<Integer> arr = new ArrayList<>(List.of(-2,9,6,1,2,-5));
	
	public void findClosestToZero() {
		Collections.sort(this.arr);
		int sumOfValue = 0;
		int first = 0, last = this.arr.size() - 1;
		int value1 = 0, value2 = 0;
		while (first < last) {
			sumOfValue = this.arr.get(first) + this.arr.get(last);
			value1 = this.arr.get(first);
			value2 = this.arr.get(last);
			if (sumOfValue < 0) {
				first++;
			}else if (sumOfValue > 0) {
				last--;
			}else {
				break;
			}
		}
		System.out.println(value1+","+value2+"="+sumOfValue);
	}
	
	public static void main(String[] args) {
		FindElementsWhoseSum obj = new FindElementsWhoseSum();
		obj.findClosestToZero(); 
	}
}
