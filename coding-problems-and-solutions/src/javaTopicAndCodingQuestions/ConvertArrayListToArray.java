package javaTopicAndCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
	public ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
	
	public void convertArrayListToArry() {
		Object[] temp = this.arr.toArray();
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
	
	public static void main(String[] args) {
		ConvertArrayListToArray obj = new ConvertArrayListToArray();
		obj.convertArrayListToArry();
	}
}

