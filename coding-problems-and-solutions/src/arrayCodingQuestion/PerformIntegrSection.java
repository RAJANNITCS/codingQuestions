package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class PerformIntegrSection {
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(3,8,10,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> mergerArr = null;
	
	public void performInteSection() {
		this.mergerArr = new ArrayList<>();
		int first = 0, second = 0;
		while (this.arr1.size() > first && this.arr2.size() > second) {
			if (this.arr1.get(first) < this.arr2.get(second)) {
				first++;
			}else if(this.arr2.get(second) < this.arr1.get(first)) {
				second++;
			}else {
				this.mergerArr.add(this.arr1.get(first));
				first++;
				second++;
			}
		}
	}
	
	public static void main(String[] args) {
		PerformIntegrSection obj = new PerformIntegrSection();
		obj.performInteSection();
		System.out.println(obj.mergerArr);
	}
}
