package javaTopic;

class Student2  {
	private int rollNo;
	private String name;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public String getName() {
		return this.name;
	}
}


public class Encapsulation {
	 
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.setRollNo(22);
		obj.setName("rohan");
		System.out.println("name "+obj.getName() + " rollNo " + obj.getRollNo());
	}
}
