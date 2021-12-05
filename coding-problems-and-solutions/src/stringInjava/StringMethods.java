package stringInjava;

public class StringMethods {
	
	public String s1 = new String("GeeksforGeeks");
	public String s2 = new String("for java learning");
	
	public static void main(String[] args) {
		StringMethods obj = new StringMethods();
		System.out.println(obj.s1.length());
		System.out.println(obj.s1.charAt(3));
		System.out.println(obj.s1.substring(3));
		System.out.println(obj.s1.concat(obj.s2));
		System.out.println(obj.s2.indexOf("java"));
		System.out.println(obj.s2.indexOf("ar", 3));
		System.out.println(obj.s2.lastIndexOf('a'));
		System.out.println(obj.s2.equals(obj.s1));
	}
}
