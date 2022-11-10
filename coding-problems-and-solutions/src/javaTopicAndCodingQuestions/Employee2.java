package javaTopicAndCodingQuestions;

import java.util.Date;

public class Employee2 {
	public int id;
	public int age;
	public Date dateOfJoining;
	
	public Employee2(int id, int age, Date dateOfJoining) {
		super();
		this.id = id;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", age=" + age + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	
}
