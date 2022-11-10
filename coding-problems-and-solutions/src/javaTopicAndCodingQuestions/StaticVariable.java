package javaTopicAndCodingQuestions;

public class StaticVariable {
	public static int count = 0;
	
	public static void main(String[] args) {
		StaticVariable obj_1 = new StaticVariable();
		StaticVariable obj_2 = new StaticVariable();
		
		obj_1.count++;
		obj_2.count++;
		
		System.out.println(StaticVariable.count);
	}
}
