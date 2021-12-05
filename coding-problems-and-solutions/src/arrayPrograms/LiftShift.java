package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class LiftShift {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	public int listShift() {
		int tempLiftShiftValue = -1;
		for (int i = this.arr.size() - 1; i > 0; i--) {
			if (i == this.arr.size() - 1) {
				tempLiftShiftValue = this.arr.get(i);
				this.arr.set(i,this.arr.get(i - 1));
			}else {
				this.arr.set(i,this.arr.get(i - 1));
			}
		}
		this.arr.set(0,0);
		return tempLiftShiftValue;
	}
	
	public static void main(String[] args) {
		LiftShift obj = new LiftShift();
		System.out.println(obj.arr);
		System.out.println("lift shift value is "+ obj.listShift());
		System.out.println(obj.arr);
	}
}
