package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class FindnBytwo {
	ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4));
	
	public void findNumberByTwo() {
		int number = 0, numberOfTime = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			if (number == this.arr.get(i)) {
				numberOfTime++;
				if (numberOfTime > (this.arr.size() / 2)) {
					break;
				}
			}else {
				number = this.arr.get(i);
				numberOfTime++;
			}
		}
		System.out.println("number " + number + " number of time " + numberOfTime);
	}
	
	public static void main(String[] args) {
		FindnBytwo obj = new FindnBytwo();
		obj.findNumberByTwo();
	}
}	
