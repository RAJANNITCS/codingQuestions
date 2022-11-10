package javaTopicAndCodingQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		Iterator<Integer> temp = arr.iterator();
		
		while (temp.hasNext()) {
			System.out.println(temp.next());
			arr.add(3);
		}
	}
}
