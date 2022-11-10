package javaTopicAndCodingQuestions;
import java.util.HashSet;

class Person31 {
	public int age;
	public String name;
	
	public Person31(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person31 other = (Person31) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class OverrloadHashcodeAndEqualsMethod {
	public static void main(String[] args) {
		HashSet<Person31> tempSet = new HashSet<Person31>();
		Person31 obj_1 = new Person31(18, "rohan");
		Person31 obj_2 = new Person31(18, "rohan");
		
		tempSet.add(obj_1);
		tempSet.add(obj_2);
		
		System.out.println(tempSet);
	}
}
