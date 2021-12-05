package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,1,0,2,4));
	
	public void rearrangeArray() {
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			tempArr.add(this.arr.get(this.arr.get(i)));
		}
		System.out.println(tempArr);
	}
	
	public static void main(String[] args) {
		RearrangeArray obj = new RearrangeArray();
		obj.rearrangeArray();
	}
}
