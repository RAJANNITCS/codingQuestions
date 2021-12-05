package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class FindMaximumValue {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16,18,20,24,26));
	public ArrayList<Integer> tempArr = null;
	
	public void findMaximumValue(int size) {
		int maxValue = this.arr.get(0);
		this.tempArr = new ArrayList<Integer>();
		for (int i = 0 ; i < this.arr.size() - size; i++) {
			for (int j = i+1; j < i + size ; j++) {
				if (maxValue < this.arr.get(j)) {
					maxValue = this.arr.get(j);
				}
			}
			this.tempArr.add(maxValue);
		}
	}
	
	public static void main(String[] args) {
		FindMaximumValue obj = new FindMaximumValue();
		obj.findMaximumValue(4);
		System.out.println(obj.tempArr);
	}
}
