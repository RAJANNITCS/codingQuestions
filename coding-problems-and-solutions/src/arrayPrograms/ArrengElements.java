// wap for arrenging -ve on left and +ve right
package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrengElements {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(-1,4,2,5,-2,-4,6,3,-2));
	
	public void arrengeElements() {
		int first = 0, last = this.arr.size() -1;
		while (first < last) {
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
		ArrengElements obj = new ArrengElements();
		System.out.println(obj.arr);
		obj.arrengeElements();
		System.out.println(obj.arr);
	}
}
