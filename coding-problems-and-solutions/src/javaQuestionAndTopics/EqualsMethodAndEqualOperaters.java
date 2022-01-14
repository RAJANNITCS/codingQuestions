package javaQuestionAndTopics;

public class EqualsMethodAndEqualOperaters {
	public static void main(String[] args) {
		String s1 = "rohan";
//		String s2 = "rohan";
		String s3 = new String("rohan");
//		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
	}
}
