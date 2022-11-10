package javaTopicAndCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public ArrayList<Student2> arr = new ArrayList<Student2>();
	
	public static void main(String[] args) {
		ComparableTest obj = new ComparableTest();
		obj.arr.add(new Student2(12, "A", 2));
		obj.arr.add(new Student2(11, "B", 1));
		obj.arr.add(new Student2(10, "C", 3));
		obj.arr.add(new Student2(9, "D", 4));
		obj.arr.add(new Student2(13, "M", 9));
		obj.arr.add(new Student2(14, "O", 8));
		obj.arr.add(new Student2(17, "L", 5));
		obj.arr.add(new Student2(13, "W", 6));
		
		obj.arr.forEach(System.out :: println);
		
		System.out.println("after sort");
		
		Collections.sort(obj.arr);
		
		obj.arr.forEach(System.out :: println);
	}
}
