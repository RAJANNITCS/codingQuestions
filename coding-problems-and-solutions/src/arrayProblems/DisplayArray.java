package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class DisplayArray {
	
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14));
	
	public static void main(String[] args) {
		DisplayArray obj = new DisplayArray();
		
//		for (int i = 0; i < obj.arr.size(); i++) {
//			System.out.println(obj.arr.get(i));
//		}
		System.out.println(obj.arr);
	} 
}
