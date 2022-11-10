package fileHandling;

import java.io.FileInputStream;

public class ReadFile {
	public static void main(String[] args) {
		StringBuffer temp = new StringBuffer();
		
		try {
			FileInputStream  obj = new  FileInputStream("a.txt");
			int data = 0;
			while ((data = obj.read()) != -1) {
				temp.append((char) data);
			}
			
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
