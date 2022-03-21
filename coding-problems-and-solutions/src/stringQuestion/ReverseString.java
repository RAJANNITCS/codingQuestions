package stringQuestion;

public class ReverseString {
	public String s1 = "1234567910";
	
	public void reverseString() {
		char[] c1 = this.s1.toCharArray();
		StringBuffer sb1 = new StringBuffer();
		for (int i = c1.length - 1; i >= 0; i--) {
			sb1.append(c1[i]);
		}
		this.s1 = new String(sb1);
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString();
		System.out.println(obj.s1);
	}
}
