package serializableAnddeserialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	public int age;
	public String name;
	
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
}
