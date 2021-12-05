package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class SeperatZeroAndOne {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(1,0,1,0,1,1,1,1,0,0,0));
	
	public void seperateZeroAndOne() {
		int first = 0, last = this.arr.size() - 1;
		while (first < last) {
			if (this.arr.get(first).equals(0)) {
				first++;
			}else if(this.arr.get(last).equals(1)) {
				last--;
			}else {
				int tempValue = this.arr.get(first);
				this.arr.set(first,this.arr.get(last));
				this.arr.set(last,tempValue);
			}
		}
	}
	
	public static void main(String[] args) {
		SeperatZeroAndOne obj = new SeperatZeroAndOne();
		obj.seperateZeroAndOne();
		System.out.println(obj.arr);
	}
}
