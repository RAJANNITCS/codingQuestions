package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class MaximumDifference {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(4,3,10,2,9,1,6));
	
	public void maximumDifference() {
		int maxValue = 0;
		int firstValue = 0, secondValue = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) < this.arr.get(j) && maxValue < (this.arr.get(j) - this.arr.get(i))) {
					maxValue = this.arr.get(j) - this.arr.get(i);
					firstValue = this.arr.get(i);
					secondValue = this.arr.get(j);
				}
			}
		}
		System.out.println(firstValue+" "+ secondValue +"="+ (secondValue - firstValue));
	}
	
	public static void main(String[] args) {
		MaximumDifference obj = new MaximumDifference();
		obj.maximumDifference();
	}
}
