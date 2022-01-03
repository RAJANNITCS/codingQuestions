package stringPrograms;

public class CheckStringIsAPalindrome {
	public String s1 = "madam";
	
	public boolean checkStringHavingPalindrome() {
		StringBuffer tempS1 = new StringBuffer();
		
		for (int i = this.s1.length() - 1; i >= 0; i--) {
			tempS1.append(this.s1.charAt(i));
		}
		
		for (int i = 0; i < this.s1.length(); i++) {
			if (this.s1.charAt(i) != tempS1.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		CheckStringIsAPalindrome obj = new CheckStringIsAPalindrome();
		System.out.println(obj.checkStringHavingPalindrome());
	}
}
