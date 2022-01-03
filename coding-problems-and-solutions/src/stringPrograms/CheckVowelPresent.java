package stringPrograms;

public class CheckVowelPresent {
	public String s1 = "Hello";
	
	public boolean checkVowelPresentV1() {
		for (int i = 0; i < this.s1.length(); i++) {
			if (this.s1.charAt(i) == 'a' || this.s1.charAt(i) == 'e' || this.s1.charAt(i) == 'o'
					|| this.s1.charAt(i) == 'i' || this.s1.charAt(i) == 'u') {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkVowelPresentV2() {
		return this.s1.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
		CheckVowelPresent obj = new CheckVowelPresent();
//		if (obj.checkVowelPresentV1()) {
//			System.out.println("String having vowel");
//		}else {
//			System.out.println("String not having vowel");
//		}
		
		if (obj.checkVowelPresentV2()) {
			System.out.println("String having vowel");
		}else {
			System.out.println("String not having vowel");
		}
	}
}
