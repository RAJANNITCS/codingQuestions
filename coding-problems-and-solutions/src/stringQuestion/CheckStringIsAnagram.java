package stringQuestion;

import java.util.Arrays;

public class CheckStringIsAnagram {
	public String s1 = "Race";
	public String s2 = "Care";
	
	public void checkAnagram() {
		this.s1 = s1.toLowerCase();
		this.s2 = s2.toLowerCase();
		
		if (this.s1.length() == this.s2.length()) {
			
			char[] c1 = this.s1.toCharArray();
			char[] c2 = this.s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean isAnagram = Arrays.equals(c1, c2);
			if (isAnagram) {
				System.out.println("String is anagram");
			}else {
				System.out.println("String is not anagram");
			}
			
		}else {
			System.out.println("string is not anagram");
		}
	}
	
	public static void main(String[] args) {
		CheckStringIsAnagram obj = new CheckStringIsAnagram();
		obj.checkAnagram();
	}
}
