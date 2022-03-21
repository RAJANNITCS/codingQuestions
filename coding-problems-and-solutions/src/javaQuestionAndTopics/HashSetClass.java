package javaQuestionAndTopics;
import java.util.HashSet;

public class HashSetClass {
	public static void main(String[] ars)  {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(2);
		hs1.add(2);
		hs1.add(4);
		hs1.add(16);
		hs1.add(8);
		hs1.add(10);
		System.out.println(hs1);
	}
}
