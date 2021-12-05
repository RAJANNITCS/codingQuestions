package stringInjava;

public class StringBufferClass {
	public StringBuffer sb1 = new StringBuffer();
	public StringBuffer sb2 = new StringBuffer(20);
	public StringBuffer sb3 = new StringBuffer("hello world");
	
	public static void main(String[] args) {
		StringBufferClass obj = new StringBufferClass();
		System.out.println(obj.sb1);
		System.out.println(obj.sb2);
		System.out.println(obj.sb3);
	}
}
