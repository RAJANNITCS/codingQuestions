package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class PerformUnionOnTwoArray {
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> mergeArr = null;
	
	public void performUnionOnTwoArray() {
		this.mergeArr = new ArrayList<>();
		int first = 0, second = 0;
		while (this.arr1.size() > first && this.arr2.size() > second) {
			if (this.arr1.get(first) < this.arr2.get(second)) {
				this.mergeArr.add(this.arr1.get(first));
				first++;
			}else if (this.arr2.get(second) < this.arr1.get(first)) {
				this.mergeArr.add(this.arr2.get(second));
				second++;
			}else {
				this.mergeArr.add(this.arr1.get(first));
				first++;
				second++;
			}
		}
		
		for (; first < this.arr1.size(); first++) {
			this.mergeArr.add(this.arr1.get(first));
			first++;
		}
		for (; second < this.arr2.size(); second++) {
			this.mergeArr.add(this.arr2.get(second));
			second++;
		}
		
	}
	
	public static void main(String[] args) {
		PerformUnionOnTwoArray obj = new PerformUnionOnTwoArray();
		obj.performUnionOnTwoArray();
		System.out.println(obj.mergeArr);
	}
}
