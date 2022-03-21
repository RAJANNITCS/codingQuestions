package serializableAnddeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializations {
	public static void main(String[] args) {
		try {
			ObjectInputStream readP = new ObjectInputStream(new FileInputStream("t.txt"));
			Student s1 =(Student) readP.readObject();
			System.out.println(s1.age+" "+s1.name);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
