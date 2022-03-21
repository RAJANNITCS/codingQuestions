package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<>(List.of(4,10,12,22,23));
	public ArrayList<Integer> mergeArray = null;
	
	public void mergeArray() {
		this.mergeArray = new ArrayList<>();
		int first = 0, second = 0;
		while (this.arr1.size() > first && this.arr2.size() > second) {
			if (this.arr1.get(first) < this.arr2.get(second)) {
				this.mergeArray.add(this.arr1.get(first));
				first++;
			}else if (this.arr2.get(second) < this.arr1.get(first)){
				this.mergeArray.add(this.arr2.get(second));
				second++;
			}else {
				this.mergeArray.add(this.arr1.get(first));
				first++;
				second++;
			}
		}
		
		for (; first < this.arr1.size(); first++) {
			this.mergeArray.add(this.arr1.get(first));
		}
		
		for (; second < this.arr2.size(); second++) {
			this.mergeArray.add(this.arr2.get(second));
		}
	}
	
	public static void main(String[] args) {
		MergeTwoArray obj = new MergeTwoArray();
		obj.mergeArray();
		System.out.println(obj.mergeArray);
	}
}
