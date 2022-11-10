package arrayCodingQuestions.java;

import java.util.ArrayList;

public class ArrangeMinusAndPlus {
	public int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };

	public void arrangeMinumAndPlus() {
		ArrayList<Integer> tempArr = new ArrayList<Integer>();

		for (int i = 0; i < this.arr.length; i++) {
			if (arr[i] > 0) {
				tempArr.add(arr[i]);
			}
		}

		for (int i = 0; i < this.arr.length; i++) {
			if (arr[i] < 0) {
				tempArr.add(arr[i]);
			}
		}

		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = tempArr.get(i);
		}
	}

	public void dispay() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}

	public static void main(String[] args) {
		ArrangeMinusAndPlus obj = new ArrangeMinusAndPlus();
		obj.dispay();
		System.out.println("arrange");
		obj.arrangeMinumAndPlus();
		obj.dispay();
	}
}
