package serializationAndDeserialization;

import java.io.Serializable;

public class Person implements Serializable{
	public transient int age;
	public String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}
