// wap a program for reverse string 
// "123"
package stringPrograms;

public class ReverseString {
	
	public String s1 = "123";
	
	public void reverseString() {
		StringBuffer tempS1 = new StringBuffer();
		for (int i = this.s1.length() - 1; i >= 0; i--) {
			tempS1.append(this.s1.charAt(i));
		}
		
		this.s1 = new String(tempS1);
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString();
		System.out.println(obj.s1);
	}
}	
