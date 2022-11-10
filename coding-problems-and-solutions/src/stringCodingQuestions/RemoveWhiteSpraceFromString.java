package stringCodingQuestions;

public class RemoveWhiteSpraceFromString {
	public String s1 = "My name is rajan singh ";
	
	public void removeWhiteSpaceFromString() {
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < this.s1.length(); i++) {
			if (this.s1.charAt(i) != ' ') {
				temp.append(this.s1.charAt(i));
			}
		}
		
		this.s1 = new String(temp);
	}
	
	public static void main(String[] args) {
		RemoveWhiteSpraceFromString obj = new RemoveWhiteSpraceFromString();
		obj.removeWhiteSpaceFromString();
		System.out.println(obj.s1);
	}
}
