package javaTopic;

class Student4 {
	public int rollNo;
	public String name;
	
	public Student4(int rollNo) {
		this.rollNo = rollNo;
		this.name = "Unknowe";
	}
	
	public Student4(String name) {
		this.rollNo = 1;// auto generated
		this.name = name;
	}
	
	public void display() {
		System.out.println("name "+this.name+ " rollNo "+ this.rollNo);
	}
}

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		Student4 obj = new Student4(2);
		obj.display();
	}
}
