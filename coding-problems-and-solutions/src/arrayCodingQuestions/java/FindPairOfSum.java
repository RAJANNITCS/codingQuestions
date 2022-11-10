package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindPairOfSum {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(6,3,8,10,7,5,2,9,14));
	
	public void findPairOfSum(int sum) {
		int maxValue = Collections.max(this.arr);
		
		int[] hashTab = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashTab[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			int findValue = sum - this.arr.get(i);
			if (findValue > 0 && findValue == hashTab[findValue]) {
				System.out.println(this.arr.get(i)+" + "+findValue+" = "+sum);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindPairOfSum obj = new FindPairOfSum();
		obj.findPairOfSum(10);
	}
}
