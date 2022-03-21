package javaQuestionAndTopics;

class Address {
	public int hoNum;
	public String state;
}

class Student10 {
	public int rollNo;
	public int age;
	public String name;
	public Address address = new Address();
}

public class Aggrigation {
	public static void main(String[] args) {
		Student10 obj = new Student10();
		obj.address.hoNum = 5;
		System.out.println(obj.address.hoNum);
	}
}
