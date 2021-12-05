package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class TranspositionInArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	public int transposeOfArray(int value) {
		int tempIndex = -1;
		for (int i = 0; i < this.arr.size(); i++) {
			if (i == 0 && this.arr.get(i) == value) {
				tempIndex = i;
				break;
			}else {
				if (this.arr.get(i).equals(value)) {
					int temp = this.arr.get(i);
					this.arr.set(i, this.arr.get(i - 1));
					this.arr.set(i - 1, temp);
					tempIndex  = i;
					break;
				}
			}
		}
		return tempIndex;
	}
	public static void main(String[] args) {
		TranspositionInArray obj = new TranspositionInArray();
		System.out.println("position of 10 = "+obj.transposeOfArray(10));
		System.out.println("position of 10 = "+obj.transposeOfArray(10));
	}
}
