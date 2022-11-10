package javaTopicAndCodingQuestions;

import java.util.concurrent.*;
import java.util.Iterator;

public class FailSafeIterator {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> arr = new ConcurrentHashMap<Integer, String>();
		arr.put(1, "A");
		arr.put(2, "B");
		arr.put(3, "C");
		arr.put(4, "D");
		arr.put(5, "E");
		arr.put(6, "F");
		arr.put(7, "G");
		
		Iterator<Integer> temp = arr.keySet().iterator();
		
		while (temp.hasNext()) {
			System.out.println(temp.next());
			arr.remove(4);
		}
	}
}
