package stringQuestion;

public class CheckVowelPresentInString {
	public String s1 = "Hello";
	
	public static void main(String[] args) {
		CheckVowelPresentInString obj = new CheckVowelPresentInString();
		System.out.println(obj.s1.toLowerCase().matches(".*[aeiou]*."));
	}
}
