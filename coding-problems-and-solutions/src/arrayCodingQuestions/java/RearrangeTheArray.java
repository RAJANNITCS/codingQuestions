package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class RearrangeTheArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,1,0,2,4));
	public ArrayList<Integer> tempArr = null;
	
	public void RearrangeTheArray() {
		this.tempArr = new ArrayList<Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			this.tempArr.add(this.arr.get(this.arr.get(i)));
		}
		System.out.println(this.tempArr);
	}
	
	public static void main(String[] args) {
		RearrangeTheArray obj = new RearrangeTheArray();
		obj.RearrangeTheArray();
	}
}
