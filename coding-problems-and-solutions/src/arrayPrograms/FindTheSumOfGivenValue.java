package arrayPrograms;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FindTheSumOfGivenValue {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(5,4,6,7,9,8,3,1,2));
	public ArrayDeque<Integer> tempDq = null;
	
	public void findTheSumOfGivenValue(int sum) {
		this.tempDq = new ArrayDeque<Integer>();
		int value = 0; 
		for (int i = 0 ; i < this.arr.size(); i++) {
			if (value < sum ) {
				this.tempDq.addLast(this.arr.get(i));
				value += this.arr.get(i);
			}else if (value > sum) {
				value -= this.tempDq.pollFirst();
				this.tempDq.addLast(this.arr.get(i));
				value+= this.arr.get(i);
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindTheSumOfGivenValue obj = new FindTheSumOfGivenValue();
		obj.findTheSumOfGivenValue(21);
		System.out.println(obj.tempDq);
	}
}
