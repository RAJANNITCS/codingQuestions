package javaTopicAndCodingQuestions;

class Student2 implements Comparable<Student2>{
	public int age;
	public String name;
	public int rollNo;
	
	public Student2(int age,String name,int rollNo) {
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student2 obj) {
		if (this.age == obj.age) {
			return 0;
		}else if (this.age > obj.age) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}
