package javaTopicAndCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByName implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class SortById implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if (o1.id == o2.id) {
			return 0;
		}else if (o1.id > o2.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class SortBySalary implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if (o1.salary == o2.salary) {
			return 0;
		}else if (o1.salary > o2.salary) {
			return 1;
		}else {
			return -1;
		}
 	}
	
}

public class ComparatorTest {
	public ArrayList<Employee1> arr = new ArrayList<Employee1>();
	
	public static void main(String[] args) {
		ComparatorTest obj = new ComparatorTest();
		obj.arr.add(new Employee1(1, 1000, "A"));
		obj.arr.add(new Employee1(3, 2000, "M"));
		obj.arr.add(new Employee1(9, 9000, "F"));
		obj.arr.add(new Employee1(12, 11000, "G"));
		obj.arr.add(new Employee1(15, 12000, "H"));
		obj.arr.add(new Employee1(17, 14000, "L"));
		obj.arr.add(new Employee1(19, 15000, "O"));
		obj.arr.add(new Employee1(21, 16000, "P"));
		obj.arr.add(new Employee1(22, 19000, "R"));
		
		obj.arr.forEach(System.out :: println);
		
		System.out.println("after sort");
		
//		Collections.sort(obj.arr,new SortByName());
		
//		Collections.sort(obj.arr,new SortById());
		
		Collections.sort(obj.arr,new SortBySalary());
		
		obj.arr.forEach(System.out :: println);
	}
}
