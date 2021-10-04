package javaCode;

public class WorkingWithFileStrime {

	public static void main(String[] args) {
		ReadWriteFile obj = new ReadWriteFile();
		
		try {
			
			obj.readFile();
			
			obj.saveFile();
			
		}catch (Exception e) {
			System.out.println("File not found........");
		}	
 
	}

}
