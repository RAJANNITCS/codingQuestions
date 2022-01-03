package stringPrograms;

public class RemoveWhiteSpaces {
	public String s1 = "my name is rohan";
	
	public void removeWhiteSpacesV1() {
		StringBuffer tempS1 = new StringBuffer();
		for (int i = 0; i < this.s1.length(); i++) {
			if ((this.s1.charAt(i)) != ' ') {
				tempS1.append(this.s1.charAt(i));
			}
		}
		
		this.s1 = new String(tempS1);
	}
	
	public void removeWhiteSpaceV2() {
		StringBuffer tempS1 = new StringBuffer();
		
		for (int i = 0; i < this.s1.length(); i++) {
			if (!Character.isWhitespace(this.s1.charAt(i))) {
				tempS1.append(this.s1.charAt(i));
			}
		}
		
		this.s1 = new String(tempS1);
	}
	
	public static void main(String[] args) {
		RemoveWhiteSpaces obj = new RemoveWhiteSpaces();
//		obj.removeWhiteSpacesV1();
		obj.removeWhiteSpaceV2();
		System.out.println(obj.s1);
	}
}
