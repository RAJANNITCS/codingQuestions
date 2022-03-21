package synchronizationInJava;

public class Unboxing {
	public static void main(String[] args) {
		Integer value = 3;
		int value1 = value.intValue();
		int value2 = value;//
		System.out.println(value1);
		System.out.println(value2);
	}
}
