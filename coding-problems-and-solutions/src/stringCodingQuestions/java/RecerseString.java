package stringCodingQuestions.java;

public class RecerseString {
	
	public static String reverseString(String s1) {
		char[] c1 = s1.toCharArray();
		StringBuffer sb1 = new StringBuffer();
		for (int i = c1.length - 1; i >= 0; i--) {
			sb1.append(c1[i]);
		}
		
		return sb1.toString();
	}
	
	public static void main(String[] args) {
		String s1 = "12345678";
		System.out.println(reverseString(s1));
	}
}
