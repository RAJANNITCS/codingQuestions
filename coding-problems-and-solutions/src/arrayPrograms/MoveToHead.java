package arrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class MoveToHead {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14,16));
	
	public int moveToFront(int value) {
		int tempIndex = -1;
		for (int i = 0; i < this.arr.size(); i++) {
			if (i == 0 && this.arr.get(i).equals(value)) {
				tempIndex = i;
				break;
			}else {
				if (this.arr.get(i).equals(value)) {
					int temp = this.arr.get(i);
					this.arr.set(i, this.arr.get(0));
					this.arr.set(0, temp);
					tempIndex = i;
					break;
				}
			}
		}
		return tempIndex;
	}
	
	public static void main(String[] args) {
		MoveToHead obj = new MoveToHead();
		System.out.println("position of 10 "+ obj.moveToFront(10));
		System.out.println("position of 10 "+ obj.moveToFront(10));
	}
}
