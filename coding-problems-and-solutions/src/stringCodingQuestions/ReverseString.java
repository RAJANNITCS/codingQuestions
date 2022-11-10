package stringCodingQuestions;

public class ReverseString {
	public String s1 = "1234567890";
	
	public void reverseString() {
		StringBuffer obj = new StringBuffer();
		
		for (int i = this.s1.length() - 1; i >= 0 ; i--) {
			obj.append(this.s1.charAt(i));
		}
		
		this.s1 = new String(obj);
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString();
		System.out.println(obj.s1);
	}
}
