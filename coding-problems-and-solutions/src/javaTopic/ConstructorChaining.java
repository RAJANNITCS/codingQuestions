package javaTopic;

class Student1 {
	
	public int id;
	public String name;
	
	public Student1() {
		this("Unnknown");
		this.id = 0;
	}
	
	public Student1(int id) {
		this("unnknown");
		this.id = id;
	}
	
	public Student1(String name) {
		this.name = name;
	}
}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		Student1 obj = new Student1(1);
		System.out.println(obj.name);
	}
}
