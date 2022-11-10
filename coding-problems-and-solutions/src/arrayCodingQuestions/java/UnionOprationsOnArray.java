package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class UnionOprationsOnArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> temp = null;
	
	public void unionOnArray() {
		this.temp = new ArrayList<Integer>();
		int first = 0, second = 0;
		while (this.arr.size() > first && this.arr1.size() > second) {
			if (this.arr.get(first) < this.arr1.get(second)) {
				this.temp.add(this.arr.get(first));
				first++;
			}else if(this.arr1.get(second) < this.arr.get(first)) {
				this.temp.add(this.arr1.get(second));
				second++;
			}else {
				this.temp.add(this.arr.get(first));
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
		UnionOprationsOnArray obj = new UnionOprationsOnArray();
		obj.unionOnArray();
	}
}
