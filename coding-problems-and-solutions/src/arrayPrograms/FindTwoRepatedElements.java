package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;

public class FindTwoRepatedElements {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,5,6,8,10,2,4,8,16));
	public ArrayList<Integer> tempArr = null;
	
	public void findTwoRepatedElements() {
		this.tempArr = new ArrayList<Integer>();
		Hashtable<Integer,Integer> hashtableTemp = new Hashtable<>();
		
		for (int i = 0; i < this.arr.size(); i++) {
			hashtableTemp.put(this.arr.get(i),hashtableTemp.containsKey(this.arr.get(i))?
					hashtableTemp.get(this.arr.get(i)) +1: 1);
		}
		
		hashtableTemp.entrySet().forEach(entry -> {
			if (entry.getValue().equals(2)) {
				this.tempArr.add(entry.getKey());
			}
		});
		
	}
	public static void main(String[] args) {
		FindTwoRepatedElements obj = new FindTwoRepatedElements();
		obj.findTwoRepatedElements();
		System.out.println(obj.tempArr);
	}
}
