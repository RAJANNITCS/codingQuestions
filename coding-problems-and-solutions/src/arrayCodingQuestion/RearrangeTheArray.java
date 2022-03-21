package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class RearrangeTheArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(3,1,0,2,4));
	public ArrayList<Integer> tempArr = null;
	
	public void reArrange() {
		this.tempArr = new ArrayList<Integer>();
		
		for (int i = 0; i < this.arr.size(); i++) {
			this.tempArr.add(this.arr.get(this.arr.get(i)));
		}
	}
	
	public static void main(String[] args) {
		RearrangeTheArray obj = new RearrangeTheArray();
		obj.reArrange();
		System.out.println(obj.tempArr);
	}
}
