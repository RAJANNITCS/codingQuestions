package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class SortArrayInFromOfWave {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
	
	
	public static void shortArrayWave(SortArrayInFromOfWave obj) {
		Collections.sort(obj.arr);
		for (int i = 0; i < obj.arr.size() - 1; i+=2) {
			int temp = obj.arr.get(i);
			obj.arr.set(i,obj.arr.get(i+1));
			obj.arr.set(i+1,temp);
		}
		System.out.println(obj.arr);
	}
	
	public static void main(String[] args) {
		SortArrayInFromOfWave obj = new SortArrayInFromOfWave();
		shortArrayWave(obj);
	}
}
