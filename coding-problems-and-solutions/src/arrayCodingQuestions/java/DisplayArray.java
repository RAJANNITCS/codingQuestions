package arrayCodingQuestions.java;
import java.util.ArrayList;
import java.util.List;

public class DisplayArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(2,4,6,8,10,12,14));
	public int[] arr_1 = {1,2,3,4,5,6,7,8};
	
	public void display() {
		if (this.arr.size() > 0) {
			for (int i = 0; i < this.arr.size(); i++) {
				System.out.println(this.arr.get(i));
			}
		}
	}
	
	public void displayV2() {
		for (int i = 0; i < this.arr_1.length; i++) {
			System.out.println(this.arr_1[i]);
		}
	}
	
	public static void main(String[] args) {
		DisplayArray obj = new DisplayArray();
//		obj.display();
		obj.displayV2();
	}
}
