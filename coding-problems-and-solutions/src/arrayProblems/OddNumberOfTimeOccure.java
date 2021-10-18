package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Hashtable;


public class OddNumberOfTimeOccure {
	ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,4,4,8,6,2,3,9));
	
	public void findOddTimeNumberV1() {
		int minValue = Collections.min(this.arr);
		int maxValue = Collections.max(this.arr);
		int[] hashTable = new int[maxValue + 1];
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashTable[this.arr.get(i)] += 1;
		}
		for (int i = minValue; i <= maxValue; i++) {
			if (hashTable[i] % 2 != 0) {
				System.out.println("value is ="+i);
				System.out.println("Number of time = "+hashTable[i]);
			}
		}
	} 
	
	public void findOddTimeNumberV2() {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			ht.put(this.arr.get(i),ht.containsKey(this.arr.get(i))? ht.get(this.arr.get(i))+1:1);
		}
		
		ht.entrySet().forEach(entry ->{
			if (entry.getValue() % 2 != 0) { 
				System.out.println("value is ="+ entry.getKey());
				System.out.println("number of time = "+ entry.getValue());
			}
		});
		
	}
	
	public static void main(String[] args) {
		OddNumberOfTimeOccure obj = new OddNumberOfTimeOccure();
//		obj.findOddTimeNumberV1();
		obj.findOddTimeNumberV2();
	}
}
