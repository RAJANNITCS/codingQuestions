package javaQuestionSet2;
import java.util.Hashtable;

public class HashTableClass {
	public Hashtable<Integer,String> ht1 = new Hashtable<Integer, String>();
	
	public static void main(String[] args) {
		HashTableClass obj = new HashTableClass();
		obj.ht1.put(1, "A");
		obj.ht1.put(2,"B");
		obj.ht1.put(3,"C");
		obj.ht1.put(4,"D");
		
		System.out.println(obj.ht1);
	}
}
