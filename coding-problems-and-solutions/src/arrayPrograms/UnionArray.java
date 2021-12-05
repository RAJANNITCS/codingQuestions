package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class UnionArray {
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<>(List.of(3,4,10,12,22,23));
	public ArrayList<Integer> tempArr = null;
	
	public void performUnion() {
		this.tempArr = new ArrayList<Integer>();
		int first = 0, second = 0;
		while (this.arr1.size() > first && second < this.arr2.size()) {
			if (this.arr1.get(first) < this.arr2.get(second)) {
				this.tempArr.add(this.arr1.get(first));
				first++;
			}else if (this.arr2.get(second) < this.arr1.get(first)) {
				this.tempArr.add(this.arr2.get(second));
				second++;
			}else {
				this.tempArr.add(this.arr1.get(first));
				first++;
				second++;
			}
		}
		for (; first < this.arr1.size(); first++) {
			this.tempArr.add(this.arr1.get(first));
		}
		for (; second < this.arr2.size(); second++) {
			this.tempArr.add(this.arr2.get(second));
		}
	}
	
	public static void main(String[] args) {
		UnionArray obj = new UnionArray();
		obj.performUnion();
		System.out.println(obj.tempArr);
	}
}
