package collectionInjava;
import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer,Integer> ht = new Hashtable<>();
		ht.put(1,1);
		ht.put(2,2);
		ht.put(3,3);
		ht.put(4,4);
		ht.put(5,5);
		
		ht.replace(1, ht.get(1)+1);
		System.out.println(ht);
		
		
//		for (Map.Entry m: ht.entrySet()) {
//			m.setValue(0);
//			System.out.println(m.getValue()+" "+m.getKey());
//			
//		}
		
		
//		System.out.println(ht.get(3));
		
//		Enumeration e = ht.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//		
//		Enumeration e1 = ht.keys();
//		while (e1.hasMoreElements()) {
//			System.out.println(e1.nextElement());
//		}
		
		
	}
}
