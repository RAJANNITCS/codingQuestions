package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class CountNumberOfSmallerElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10,3,4,5,7,1,3,2));
	public ArrayList<Integer> tempArr = null;
	
	public void countNumberOfSmallerElements() {
		this.tempArr = new ArrayList<Integer>();
		int count;
		for (int i = 0; i < this.arr.size(); i++) {
			count = 0;
			for (int j = i+1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					count++;
				}
			}
			this.tempArr.add(count);
		}
	}
	
	public static void main(String[] args) {
		CountNumberOfSmallerElements obj = new CountNumberOfSmallerElements();
		obj.countNumberOfSmallerElements();
		System.out.println(obj.tempArr);
	}
}
