package javaQuestionSet2;
import java.util.HashSet;

public class HashSetClass {
	public HashSet<Integer> hs1 = new HashSet<Integer>();
	
	public static void main(String[] args) {
		HashSetClass obj = new HashSetClass();
		obj.hs1.add(2);
		obj.hs1.add(4);
		obj.hs1.add(6);
		obj.hs1.add(8);
		obj.hs1.add(10);
		obj.hs1.add(12);
		obj.hs1.add(15);
		System.out.println(obj.hs1);
	}
}
