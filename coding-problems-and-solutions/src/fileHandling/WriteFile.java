package fileHandling;

import java.io.FileOutputStream;

public class WriteFile {
	public static void main(String[] args) {
		String s1 = "my name is rajan singh";
		
		try {
			FileOutputStream obj = new FileOutputStream("a.txt");
			for (int i = 0; i < s1.length(); i++) {
				obj.write(s1.charAt(i));
			}
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
