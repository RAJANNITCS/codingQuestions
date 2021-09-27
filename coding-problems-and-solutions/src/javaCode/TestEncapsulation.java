package javaCode;

public class TestEncapsulation {
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation("rajan singh", 16, 28);
		System.out.println("Name of the studant"+ obj.getStudantName());
		System.out.println("Age of the studant"+ obj.getStudantAge());
		System.out.println("roll No of the studant"+ obj.getStudantRollNo());
	}
}
