package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationsExample {
	public static void main(String[] args) {
		try {
			ObjectOutputStream saveObj = new ObjectOutputStream(new FileOutputStream("a.txt"));
			Person obj = new Person(18,"rohan");
			saveObj.writeObject(obj);
			saveObj.close();
			System.out.println("done");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
