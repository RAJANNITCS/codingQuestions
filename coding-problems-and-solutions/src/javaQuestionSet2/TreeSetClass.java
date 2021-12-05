package javaQuestionSet2;
import java.util.TreeSet;

public class TreeSetClass {
	public TreeSet<Integer> ts1 = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		TreeSetClass obj = new TreeSetClass();
		obj.ts1.add(8);
		obj.ts1.add(2);
		obj.ts1.add(9);
		obj.ts1.add(1);
		obj.ts1.add(10);
		
		System.out.println(obj.ts1);
	}
}
