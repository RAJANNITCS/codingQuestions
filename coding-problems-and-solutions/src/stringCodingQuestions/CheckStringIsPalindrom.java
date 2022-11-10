package stringCodingQuestions;

public class CheckStringIsPalindrom {
	public String s1 = "madam";
	
	public boolean checkGivenStringIsPalindrom( ) {
		boolean isStringPalindrom = false;
		
		for (int i = 0 , j = this.s1.length() - 1; i < this.s1.length() && j >= 0; i++, j--) {
			if (this.s1.charAt(i) == this.s1.charAt(j)) {
				isStringPalindrom = true;
			}else {
				isStringPalindrom = false;
				break;
			}
		}
		
		return isStringPalindrom;
	}
	
	public static void main(String[] args) {
		CheckStringIsPalindrom obj = new CheckStringIsPalindrom();
		if (obj.checkGivenStringIsPalindrom()) {
			System.out.println("string is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
	}
}
