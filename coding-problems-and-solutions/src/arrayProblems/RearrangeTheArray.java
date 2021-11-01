package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class RearrangeTheArray {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,1,0,2,4));
	
	public static void rearrangeArray(RearrangeTheArray obj) {
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < obj.arr.size(); i++) {
			tempArray.add(obj.arr.get(obj.arr.get(i)));
		}
		System.out.println(tempArray);
	}
	public static void main(String[] args) {
		RearrangeTheArray obj = new RearrangeTheArray();
		rearrangeArray(obj);
	}
}
