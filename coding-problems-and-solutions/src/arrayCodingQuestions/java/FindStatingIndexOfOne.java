package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindStatingIndexOfOne {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(0,0,0,0,0,0,0,0,0,0,0,0
			,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
	
	public void findStatingIndexOfOne() {
		int first = 0, rear = 10;
		while (first < rear) {
			if (this.arr.get(first).equals(1)) {
				System.out.println(first);
				break;
			}else {
				first++;
				if (first == rear - 1) {
					rear += 10;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindStatingIndexOfOne obj = new FindStatingIndexOfOne();
		obj.findStatingIndexOfOne();
	}
}
