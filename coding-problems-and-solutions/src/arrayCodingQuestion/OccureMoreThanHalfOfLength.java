package arrayCodingQuestion;
import java.util.ArrayList;
import java.util.List;

public class OccureMoreThanHalfOfLength {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,2,2,2,2,2,2,3,3,3,4,4,5));
	
	public void occureMoreThanHalfOfLength() {
		int count = 0, value = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			if (this.arr.get(i).equals(value)) {
				int lengthOf = this.arr.size() / 2;
				if (count != lengthOf) {
					count++;
				}else {
					System.out.println("number of time "+ count +" value is "+value);
					break;
				}
			}else {
				value = this.arr.get(i);
				count = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		OccureMoreThanHalfOfLength obj = new OccureMoreThanHalfOfLength();
		obj.occureMoreThanHalfOfLength();
	}
}
