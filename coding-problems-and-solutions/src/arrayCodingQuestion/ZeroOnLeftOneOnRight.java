package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class ZeroOnLeftOneOnRight {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(1,0,1,0,1,0,1,1,1,0,0,0));
	
	public void zeroOnLeftOneOnRight() {
		int first = 0, last = this.arr.size() - 1;
		while (first < last) {
			if (this.arr.get(first).equals(0)) {
				first++;
			}else if(this.arr.get(last).equals(1)){
				last--;
			}else {
				int tempValue = this.arr.get(first);
				this.arr.set(first, this.arr.get(last));
				this.arr.set(last, tempValue);
			}
		}
	}
	
	public static void main(String[] args) {
		ZeroOnLeftOneOnRight obj = new ZeroOnLeftOneOnRight();
		obj.zeroOnLeftOneOnRight();
		System.out.println(obj.arr);
	}
}
