package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class FindCountOfSmallerElements {
	ArrayList<Integer> arr = new ArrayList<>(List.of(10,3,4,5,7,1,3,2));
	LinkedList<Integer> tempList = new LinkedList<>();
	
	public void findCountOfSmallerElements() {
		int count = 0;
		for(int i = 0; i < this.arr.size(); i++) {
			count = 0;
			for (int j = i + 1; j < this.arr.size(); j++) {
				if (this.arr.get(i) > this.arr.get(j)) {
					count++;
				}
			}
			this.tempList.addLast(count);
		}
	}
	public static void main(String[] args) { 
		FindCountOfSmallerElements obj = new FindCountOfSmallerElements();
		obj.findCountOfSmallerElements();
		System.out.println(obj.tempList);
	}
	
}
