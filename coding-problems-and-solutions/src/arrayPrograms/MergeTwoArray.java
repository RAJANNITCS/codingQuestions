package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
	public ArrayList<Integer> arr1 = new ArrayList<>(List.of(3,8,16,20,25));
	public ArrayList<Integer> arr2 = new ArrayList<>(List.of(4,10,12,22,23));
	public ArrayList<Integer> tempArray = null;
	
	public void mergeTwoArray() {
		this.tempArray = new ArrayList<>();
		int i = 0, j = 0;
		while (i < this.arr1.size() && j < this.arr2.size()) {
			if (this.arr1.get(i) < this.arr2.get(j)) {
				this.tempArray.add(this.arr1.get(i));
				i++;
			}else if (this.arr1.get(i) > this.arr2.get(j)){
				this.tempArray.add(this.arr2.get(j));
				j++;
			}else {
				this.tempArray.add(this.arr1.get(i));
				this.tempArray.add(this.arr2.get(j));
				i++;
				j++;
			}
		}
		for (; i < this.arr1.size(); i++) {
			this.tempArray.add(this.arr1.get(i));
		}
		for (; j < this.arr2.size(); j++) {
			this.tempArray.add(this.arr2.get(j));
		}
	}
	
	public static void main(String[] args) {
		MergeTwoArray obj = new MergeTwoArray();
		obj.mergeTwoArray();
		System.out.println(obj.tempArray);
	}
}
