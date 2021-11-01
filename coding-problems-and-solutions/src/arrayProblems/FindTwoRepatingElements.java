package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;

public class FindTwoRepatingElements {
	
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,5,6,8,10,2,12,14,16));
	
	public void findTwoRepatitedElements() {
		Hashtable<Integer, Integer> tempHt = new Hashtable<Integer, Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			tempHt.put(this.arr.get(i), tempHt.containsKey(this.arr.get(i))?
					tempHt.get(this.arr.get(i))+1:1);
		}
		
		tempHt.entrySet().forEach(entry -> {
			if (entry.getValue() >= 2) {
				System.out.println("key is "+entry.getKey()+" "+"value is "+entry.getValue());
			}
		});
	}
	
	public static void main(String[] args) {
		FindTwoRepatingElements obj = new FindTwoRepatingElements();
		obj.findTwoRepatitedElements();
	}
}
