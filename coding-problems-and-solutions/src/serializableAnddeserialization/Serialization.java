package serializableAnddeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		try {
			Student s1 = new Student(22, "rohan");
			FileOutputStream obj = new FileOutputStream("t.txt");
			ObjectOutputStream writeP = new ObjectOutputStream(obj);
			writeP.writeObject(s1);
			writeP.flush();
			writeP.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
