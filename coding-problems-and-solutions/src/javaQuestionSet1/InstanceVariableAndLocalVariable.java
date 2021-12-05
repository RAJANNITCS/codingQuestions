package javaQuestionSet1;

class Person1 {
	public int age;
	public String name;
	
	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class InstanceVariableAndLocalVariable {
	public static void main(String[]  args) {
		Person1 rohan = new Person1(22, "rohan");
		System.out.println(rohan.age);
	}
}
