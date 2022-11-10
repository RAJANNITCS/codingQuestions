package javaTopicAndCodingQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {
	
	public void readFile() throws FileNotFoundException {
		FileInputStream obj = new FileInputStream("d:/abc.txt");
	}
	
	public void saveFile() throws FileNotFoundException {
		FileOutputStream obj = new FileOutputStream("d:/abc.txt");
	}
}
public class ThrowsExceptionExample {
	public static void main(String[] args) {
		ReadAndWrite obj = new ReadAndWrite();
		try {
			obj.readFile();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
