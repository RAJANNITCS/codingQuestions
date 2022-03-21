package codingQuestionAndTopicPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindThePairOfAB {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(6,3,8,10,7,5,2,9,14));
	
	public void findPairOfab(int value) {
		int maxValue = Collections.max(this.arr);
		
		int[] ht = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			ht[this.arr.get(i)] = this.arr.get(i);
		}
		
		for (int i = 0; i < this.arr.size(); i++) {
			int b = value - this.arr.get(i);
			if (b > 0 && ht[b] == b) {
				System.out.println(this.arr.get(i)+" + "+b+" = "+value);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindThePairOfAB obj = new FindThePairOfAB();
		obj.findPairOfab(10);
	}
}
