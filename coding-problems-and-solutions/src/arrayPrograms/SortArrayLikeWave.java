package arrayPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortArrayLikeWave {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
	
	public void sortArraylikeWave() {
		Collections.sort(this.arr);
		for (int i = 0 ; i < this.arr.size() - 1; i+=2) {
			if (this.arr.get(i) < this.arr.get(i+1)) {
				int temp = this.arr.get(i);
				this.arr.set(i,this.arr.get(i+1));
				this.arr.set(i+1,temp);
			}
		}
	}
	
	public static void main(String[] args) {
		SortArrayLikeWave obj = new SortArrayLikeWave();
		obj.sortArraylikeWave();
		System.out.println(obj.arr);
	}
}
