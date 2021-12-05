package stringInjava;

public class StringConstructor {
	
	// String constructor start
	byte[] b_arr = {71, 101, 101, 107, 115};
	String s1 = new String(b_arr);
	
	byte[] b1 = {71, 101, 101, 107, 115};
	String s2 = new String(b1, 1, 3);
	
	char[] c1 = {'G', 'e', 'e', 'k','s'};
	String s3 = new String(c1);
	
	char[] c2 = {'G', 'e','e','k','s'};
	String s4 = new String(c2,1,3);
	
	StringBuffer sb1 = new StringBuffer("person");
	String s5 = new String(sb1);
	
	StringBuilder sb2 = new StringBuilder("Person2");
	String s6 = new String(sb2);
  	// String constructor end
	
	public static void main(String[] args) {
		StringConstructor obj = new StringConstructor();
		System.out.println(obj.s1);
		System.out.println(obj.s2);
		System.out.println(obj.s3);
		System.out.println(obj.s4);
		System.out.println(obj.s5);
		System.out.println(obj.s6);
	}
	
}
