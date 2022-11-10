package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class CountOfSmallestElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10,3,4,5,7,1,3,2));
	public ArrayList<Integer> temp = null;
	
	public void countOfSmallestElements() {
		this.temp = new ArrayList<Integer>();
		int count;
		for (int i = 0; i < this.arr.size(); i++) {
			count = 0;
			for (int j = i+1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					count++;
				}
			}
			this.temp.add(count);
		}
		System.out.println(this.temp);
	}
	
	public static void main(String[] args) {
		CountOfSmallestElements obj = new CountOfSmallestElements();
		obj.countOfSmallestElements();
	}
}
