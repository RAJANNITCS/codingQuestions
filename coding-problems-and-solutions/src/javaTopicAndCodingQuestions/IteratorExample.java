package javaTopicAndCodingQuestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2,4,6,8,10,12,14));
	
	public static void main(String[] args) {
		IteratorExample obj = new IteratorExample();
		Iterator<Integer> temp = obj.arr.iterator();
		
		while (temp.hasNext()) {
			System.out.println(temp.next());
		}
	}
}
