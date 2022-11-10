package javaTopicAndCodingQuestions;

public class Employee1 {
	public int id;
	public int salary;
	public String name;

	public Employee1(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}
