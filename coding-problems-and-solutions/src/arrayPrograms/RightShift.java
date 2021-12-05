package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class RightShift {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	public int rightShift() {
		int tempShiftValue = -1;
		for (int i = 0; i < this.arr.size() - 1; i++) {
			if (i == 0) {
				tempShiftValue = this.arr.get(i);
				this.arr.set(i,this.arr.get(i + 1));
			}else {
				this.arr.set(i,this.arr.get(i + 1));
			}
		}
		this.arr.set(this.arr.size() - 1, 0);
		return tempShiftValue;
	}
	
	public static void main(String[] args) {
		RightShift obj = new RightShift();
		System.out.println(obj.arr);
		System.out.println("right shift value is " + obj.rightShift());
		System.out.println(obj.arr);
	}
}
