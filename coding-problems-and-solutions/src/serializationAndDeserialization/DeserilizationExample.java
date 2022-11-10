package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilizationExample {
	public static void main(String[] args) {
		try {
			ObjectInputStream openObj = new ObjectInputStream(new FileInputStream("a.txt"));
			Person obj = (Person) openObj.readObject();
			obj.display();
			openObj.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
