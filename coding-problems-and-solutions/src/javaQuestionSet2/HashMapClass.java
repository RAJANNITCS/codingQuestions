package javaQuestionSet2;
import java.util.HashMap;

public class HashMapClass {
	public HashMap<Integer,String> hm1 = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		HashMapClass obj = new HashMapClass();
		obj.hm1.put(1, "rajan");
		obj.hm1.put(2, "mohan");
		obj.hm1.put(3, "rohan");
		
		System.out.println(obj.hm1);
	}
}
