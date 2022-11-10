package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(4,10,12,22,23));
	public ArrayList<Integer> temp = null;
	
	public void mergeTwoArray() {
		this.temp = new ArrayList<Integer>();
		int first = 0, second = 0;
		while (this.arr.size() > first && this.arr1.size() > second) {
			if (this.arr.get(first) < this.arr1.get(second)) {
				this.temp.add(this.arr.get(first));
				first++;
			}else if (this.arr.get(first) > this.arr1.get(second)) {
				this.temp.add(this.arr1.get(second));
				second++;
			}else {
				this.temp.add(this.arr.get(first));
				this.temp.add(this.arr1.get(second));
				first++;
				second++;
			}
		}
		
		for (; first < this.arr.size(); first++) {
			this.temp.add(this.arr.get(first));
		}
		for (; second < this.arr1.size(); second++) {
			this.temp.add(this.arr1.get(second));
		}
		
		System.out.println(this.temp);
	}
	
	public static void main(String[] args) {
		MergeTwoArray obj = new MergeTwoArray();
		obj.mergeTwoArray();
	}
}
