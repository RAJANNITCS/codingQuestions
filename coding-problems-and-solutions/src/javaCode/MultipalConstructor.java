package javaCode;

class Employ {
	private String nameOfEmploy;
	private int empNumber;
	private double salaryOfEmploy;
	
	public Employ(String nameOfEmploy) {
		this.nameOfEmploy = nameOfEmploy;
	}
	
	public Employ(int empNumber) {
		this.empNumber = empNumber;
	}
	
	public Employ(double salaryOfEmploy) {
		this.salaryOfEmploy = salaryOfEmploy;
	}
	
	public void printVariable() {
		System.out.println("Name of Employ "+ this.nameOfEmploy);
		System.out.println("Employ number " + this.empNumber);
		System.out.println("Salary of Employ " + this.salaryOfEmploy );
	}
}

public class MultipalConstructor {
	public static void main(String[] args) {
		Employ obj = new Employ("Rajan Singh");
		obj.printVariable();
	}
}
