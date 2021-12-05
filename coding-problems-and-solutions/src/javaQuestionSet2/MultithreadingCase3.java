// Performing Multiple task from multipal thread
package javaQuestionSet2;

class Person extends Thread{
	
	@Override 
	public void run() {
		System.out.println("Person class thread");
	}
}

class Student extends Thread {
	
	@Override
	public void run() {
		System.out.println("Student class thread");
	}
}

public class MultithreadingCase3 extends Thread{
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student();
		p1.start();
		s1.start();
	}
}
