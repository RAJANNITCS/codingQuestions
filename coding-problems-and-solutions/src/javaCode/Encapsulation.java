package javaCode;

public class Encapsulation {
     
	private String studantName;
	private int studantRollNo;
	private int studantAge;
	
	public Encapsulation(String name, int rollNo, int age) {
		this.studantName = name;
		this.studantRollNo = rollNo;
		this.studantAge = age;
	}
	
	public void setStudantName(String name) {
		this.studantName = name;
	}
	
	public String getStudantName() {
		return this.studantName;
	}
	
	public void setStudantRollNo(int rollNo) {
		this.studantRollNo = rollNo;
	}
	
	public int getStudantRollNo() {
		return this.studantRollNo;
	}
	
	public void setStudantAge(int age) {
		this.studantAge = age;
	}
	
	public int getStudantAge() {
		return this.studantAge;
	}
}
