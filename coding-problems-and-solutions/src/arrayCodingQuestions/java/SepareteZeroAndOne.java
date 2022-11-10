package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class SepareteZeroAndOne {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,0,1,0,0,0,0,1,1,1,0,0,0,1));
	
	public void separeteZeroAndOne() {
		int first = 0, rear = this.arr.size() - 1;
		while (first < rear) {
			if (this.arr.get(first).equals(0)) {
				first++;
			}else if (this.arr.get(rear).equals(1)) {
				rear--;
			}else {
				Integer temp = this.arr.get(first);
				this.arr.set(first, this.arr.get(rear));
				this.arr.set(rear, temp);
			}
		}
		System.out.println(this.arr);
	}
	
	public static void main(String[] args) {
		SepareteZeroAndOne obj = new SepareteZeroAndOne();
		obj.separeteZeroAndOne();
	}
}
