package collectionInjava;
import java.util.*;

public class StackClassDemo {
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
//		System.out.println(s1.empty());
		s1.push(2);
		s1.push(4);
		s1.push(6);
		s1.push(8);
		s1.push(10);
		s1.push(12);
//		System.out.println("pop="+s1.pop());
//		System.out.println(s1.peek());
//		System.out.println(s1.search(12));
		System.out.println(s1.size());
	}
	
}
