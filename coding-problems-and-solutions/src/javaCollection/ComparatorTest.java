package javaCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorTest {
	public ArrayList<Employee> empList = new ArrayList<>();
	
	public static void main(String[] args) {
		ComparatorTest obj = new ComparatorTest();
		obj.empList.add(new Employee(22, "rohan", 1000));
		obj.empList.add(new Employee(32, "seema", 30000));
		obj.empList.add(new Employee(30, "mohan", 4000));
		
		System.out.println(obj.empList);
		Collections.sort(obj.empList,new NameComparator());
		System.out.println(obj.empList);
	}
}
