package javaQuestionSet1;

public class EqualMethod {
	public String s1 = new String("Deepak");
	public String s2 = new String("Deepak");
	
	public static void main(String[] args) {
		EqualMethod obj = new EqualMethod();
		System.out.println(obj.s1.equals(obj.s2));
	}

}
