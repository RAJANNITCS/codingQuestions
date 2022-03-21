package codingQuestionAndTopicPractice;
import java.util.ArrayList;
import java.util.List;

public class DisplayArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12));
	public int[] arr1 = {2,4,6,8,10,12,14};
	
	public void display() {
		if (this.arr.size() > 0) {
			for (int i = 0; i < this.arr.size(); i++) {
				System.out.println(this.arr.get(i));
			}
		}
	}
	
	public void displayArray() {
		if (this.arr1.length > 0) {
			for (int i = 0; i < this.arr1.length; i++) {
				System.out.println(this.arr1[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		DisplayArray obj = new DisplayArray();
//		obj.display();
		obj.displayArray();
	}
}
