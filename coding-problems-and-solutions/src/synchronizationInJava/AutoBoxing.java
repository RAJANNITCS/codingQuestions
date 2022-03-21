package synchronizationInJava;

public class AutoBoxing {
	public static void main(String[] args) {
		int value = 20;
		Integer value1 = Integer.valueOf(value);// converting int into integer explicitly
		Integer value2 = value;// autoboxing, now compiler will write integer 
		//.valueOf(a) internally
		System.out.println(value1);
		System.out.println(value2);
	}
}
