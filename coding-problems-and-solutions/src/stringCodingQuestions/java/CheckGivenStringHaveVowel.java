package stringCodingQuestions.java;

public class CheckGivenStringHaveVowel {
	
	public static boolean checkGivenStringHaveVowel(String s1) {
		return s1.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(checkGivenStringHaveVowel(s1));
	}
}
