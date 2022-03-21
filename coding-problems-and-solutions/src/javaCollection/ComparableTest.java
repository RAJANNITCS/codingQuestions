package javaCollection;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public ArrayList<Student> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		ComparableTest obj = new ComparableTest();
		obj.arr.add(new Student(18, 18, "rohan"));
		obj.arr.add(new Student(15, 17, "mohan"));
		obj.arr.add(new Student(20, 20, "seema"));
		
		System.out.println(obj.arr);
		Collections.sort(obj.arr);
		System.out.println(obj.arr);
	}
}
