package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class MinuseOnRightPluseOnleft {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(-1,1,-2,2,-3,3,-4,4,-5,5));
	
	public void minuseOnRightPluseOnLeft() {
		int first = 0, last = this.arr.size() - 1;
		while (first <= last) {
			if (this.arr.get(first) < 0) {
				first++;
			}else if(this.arr.get(last) > 0) {
				last--;
			}else {
				int temp = this.arr.get(first);
				this.arr.set(first,this.arr.get(last));
				this.arr.set(last,temp);
			}
		}
	}
	
	public static void main(String[] args) {
		MinuseOnRightPluseOnleft obj = new MinuseOnRightPluseOnleft();
		System.out.println(obj.arr);
		obj.minuseOnRightPluseOnLeft();
		System.out.println(obj.arr);
	}
}
