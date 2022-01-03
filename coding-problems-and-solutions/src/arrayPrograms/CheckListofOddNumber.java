package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class CheckListofOddNumber {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,3,5,10,9,11,13));
	
	public boolean checkListHavingOnlyOddNumber() {
			for (int i = 0; i < this.arr.size(); i++) {
				if (this.arr.get(i) % 2 == 0) {
					return false;
				}
			}
		return true;
	}
	
	
	public static void main(String[] args) {
		CheckListofOddNumber obj = new CheckListofOddNumber();
		System.out.println(obj.checkListHavingOnlyOddNumber());
	}
}
