package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class FindMaxmumElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16,18,20,22));
	public ArrayList<Integer> tempArr = null;
	
	public void findMaxmumElements(int k) {
		this.tempArr = new ArrayList<>();
		int maxValue = this.arr.get(0);
		for (int i = 0; i <= this.arr.size() - k; i++) {
			for (int j = i; j < i+k; j++) {
				if (maxValue < this.arr.get(j)) {
					maxValue = this.arr.get(j);
				}
			}
			this.tempArr.add(maxValue);
		}
	}
	
	public static void main(String[] args) {
		FindMaxmumElements obj = new FindMaxmumElements();
		obj.findMaxmumElements(4);
		System.out.println(obj.tempArr);
	}
}
