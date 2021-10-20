package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class SeperateZeroAndOne {
	ArrayList<Integer> arr = new ArrayList<>(List.of(1,0,0,1,0,1,1,1,0,0,0));
	
	public void seprateZeroAndOneV1() {
		int first = 0;
		int last = this.arr.size() - 1;
		while (first <= last) {
			if (this.arr.get(first).equals(0)) {
				first++;
			}else if (this.arr.get(last).equals(1)) {
				last--;
			}else {
				int tempValue = this.arr.get(first);
				this.arr.set(first, this.arr.get(last));
				this.arr.set(last,tempValue);
			}
		}
		
		System.out.println(this.arr); 
	}
	
	

	
	public static void main(String[] args) {
		SeperateZeroAndOne obj = new SeperateZeroAndOne();
//		obj.seprateZeroAndOneV1();
	}
}
