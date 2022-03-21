package javaCollection;

public class Student implements Comparable<Student>{
	public int age;
	public int rollNo;
	public String name;
	
	public Student(int age, int rollNo, String name) {
		this.age = age;
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.rollNo == o.rollNo) {
			return 0;
		}else if (this.rollNo > o.rollNo) {
			return 1;
		}else {
			return -1;
		}
	}
}
