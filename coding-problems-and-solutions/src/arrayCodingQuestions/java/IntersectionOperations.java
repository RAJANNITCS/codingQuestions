package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOperations {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,8,10,20,25));
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> temp = null;
	
	public void intersectionOperations() {
		this.temp = new ArrayList<Integer>();
		int first = 0, second = 0;
		while (this.arr.size() > first && this.arr1.size() > second) {
			if (this.arr.get(first) < this.arr1.get(second)) {
				first++;
			}else if (this.arr1.get(second) < this.arr.get(first)) {
				second++;
			}else {
				this.temp.add(this.arr.get(first));
				first++;
				second++;
			}
		}
		
		System.out.println(this.temp);
	}
	
	public static void main(String[] args) {
		IntersectionOperations obj = new IntersectionOperations();
		obj.intersectionOperations();
	}
}
