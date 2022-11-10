package stringCodingQuestions;

public class StringHaveVowel {
	public String s1 = "Hello";

	public void stringHaveVowelV1() {
		if (this.s1.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("string having vowel");
		} else {
			System.out.println("string not containet vowel");
		}
	}

	public boolean stringHaveVowelV2() {
		return this.s1.toLowerCase().matches(".*[aeiou].*");
	}

	public boolean stringHaveVowelV3() {
		boolean isVowel = false;
		for (int i = 0; i < this.s1.length(); i++) {
			if (this.s1.toLowerCase().charAt(i) == 'a' || this.s1.toLowerCase().charAt(i) == 'e'
					|| this.s1.toLowerCase().charAt(i) == 'i' || this.s1.toLowerCase().charAt(i) == 'o'
					|| this.s1.toLowerCase().charAt(i) == 'u') {
				isVowel = true;
				break;
			}
		}
		return isVowel;
	}

	public static void main(String[] args) {
		StringHaveVowel obj = new StringHaveVowel();
//		obj.stringHaveVowelV1();
		if (obj.stringHaveVowelV3()) {
			System.out.println("string having vowel");
		}else {
			System.out.println("string not have vowel");
		}
	}
}
