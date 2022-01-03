package javaTopic;
import java.util.HashMap;
import java.util.ArrayList;

class Employ {
	public int id;
	public int age;
	public String name;
	public int salary;
	
	public Employ(int id, int age, String name, int salary) {
		this.id = id; 
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
}

public class TestHashMap {
	public HashMap<Integer, Employ> employData = new HashMap<Integer, Employ>();
	
	public void addData() {
		for (int i = 0; i < 100; i++) {
			this.employData.put(i, new Employ(i, i+5, i+"-rajan", i+1000));
		}
	}
	
	public void printName() {
		Employ obj1 = this.employData.get(1);
		System.out.println(obj1.name);
	}
	
	public static void main(String[] args) {
		TestHashMap obj = new TestHashMap();
		obj.addData();
		obj.printName();
	}
}
