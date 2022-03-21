package javaQuestionAndTopicsPractice;

public class StaticVariable {
	public static int count = 0;
	
	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		obj.count++;
		StaticVariable obj_1 = new StaticVariable();
		obj_1.count++;
		System.out.println(count);
	}
}
