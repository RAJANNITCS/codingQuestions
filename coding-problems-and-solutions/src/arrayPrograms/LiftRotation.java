// wap for lift rotation
package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class LiftRotation {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14,16));
	
	public void liftRotation(int numberOfTime) {
		int i = 0;
		while (i < numberOfTime) {
			int tempLetfShiftValue = 0;
			for (int j = this.arr.size() - 1; j > 0; j--) {
				if (j == this.arr.size() - 1) {
					tempLetfShiftValue = this.arr.get(j);
					this.arr.set(j,this.arr.get(j - 1));
				}else {
					this.arr.set(j,this.arr.get(j - 1));
				}
			}
			this.arr.set(0,tempLetfShiftValue);
			i++;
		}
	}
	
	public static void main(String[] args) {
		LiftRotation obj = new LiftRotation();
		System.out.println(obj.arr);
		obj.liftRotation(2);
		System.out.println(obj.arr);
	}
}
