package arrayProblems;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValueBetweenGivenNumber {
	ArrayList<Integer> arr = new ArrayList(List.of(2,4,6,8,10,12,14,16,18,20,22,24,26));
	ArrayList<Integer> tempArr = new ArrayList<>();
	
	public void findMaxValueBetweenGivenNumberV1(int num) {
		int maxValue = 0;
		for (int i = 0; i <= this.arr.size() - num; i++ ) {
			maxValue = this.arr.get(i);
			for (int j = i; j < i+num; j++) {
				if (maxValue < this.arr.get(j)) {
					maxValue = this.arr.get(j);
				}
			}
			this.tempArr.add(maxValue);
			
		}
	}
	public static void main(String[] args) {
		FindMaxValueBetweenGivenNumber obj = new FindMaxValueBetweenGivenNumber();
		obj.findMaxValueBetweenGivenNumberV1(4);
		System.out.println(obj.tempArr);
	}
}
