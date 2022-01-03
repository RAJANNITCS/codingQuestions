package javaTopic;

class Student implements Cloneable{
	public int id;
	public String name;
	
	public Student (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectCloneing {
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student obj1 = new Student(1, "rohan");
		Student obj2 = (Student) obj1.clone();
		
		System.out.println(obj2.id+" "+obj2.name);
	}
}
