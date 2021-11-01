package arrayProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;

public final class FindSubArrayWhichSum {
	
	List<Integer> case1 = List.of(5,4,6,7,9,8,3,1,2);
	public ArrayList<Integer> arr = new ArrayList<>(case1);
	
	public void findSubArrayV1(int value) {
		int sum = 0;
		ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
		for (int i = 0; i < this.arr.size(); i++) {
			if (value == sum) {
				break;
			}else if(sum < value) {
				sum += this.arr.get(i);
				temp.addLast(this.arr.get(i));
			}else {
				sum -= temp.pollFirst();
				temp.addLast(this.arr.get(i));
				sum += this.arr.get(i);
			}
		}
		System.out.println("sub array is "+temp);
	}
	
	public void findSubArrayV2(int value) {
		int tailPoint = 0;
		int lastPoint = 0;
		int sum = 0;
		while (lastPoint < this.arr.size()) {
			if (sum == value) {
				break;
			}else if(sum < value) {
				sum += this.arr.get(lastPoint);
				lastPoint++;
			}else {
				sum -= this.arr.get(tailPoint);
				sum += this.arr.get(lastPoint);
				tailPoint++;
				lastPoint++;
			}
		}
		while (tailPoint < lastPoint) {
			System.out.println(this.arr.get(tailPoint));
			tailPoint++;
		}
	}
	
	public static void main(String[] args) {
		FindSubArrayWhichSum obj = new FindSubArrayWhichSum();
		int value = 21;
		obj.findSubArrayV1(value);
//		obj.findSubArrayV2(value);
	}
}
