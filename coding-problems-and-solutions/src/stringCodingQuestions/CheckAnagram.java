package stringCodingQuestions;

import java.util.HashSet;

public class CheckAnagram {
	String s1 = "Race";
	String s2 = "Carw";
	
	public boolean checkStringIsAnagram() {
		HashSet<Character> temp = new HashSet<Character>();
		boolean isStringAnagram = false;
		for (int i = 0; i < this.s1.length(); i++) {
			temp.add(this.s1.charAt(i));
		}
		
		for (int i = 0; i < this.s2.length(); i++) {
			if (temp.contains(this.s2.charAt(i))) {
				isStringAnagram = true;
			}else {
				isStringAnagram = false;
				break;
			}
		}
		
		return isStringAnagram;
	}
	
	public static void main(String[] args) {
		CheckAnagram obj = new CheckAnagram();
		if (obj.checkStringIsAnagram()) {
			System.out.println("String is anagram");
		}else {
			System.out.println("String is not anagram");
		}
	}
}
