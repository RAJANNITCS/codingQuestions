package javaCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadWriteFile {
	
	public void readFile() throws FileNotFoundException{
		FileInputStream obj = new FileInputStream("d:/newfile");
	}
	
	public void saveFile() throws FileNotFoundException{
		FileInputStream obj = new FileInputStream("d:/newFile/java");;
	}
}
   