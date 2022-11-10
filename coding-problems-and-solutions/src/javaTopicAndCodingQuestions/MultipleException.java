package javaTopicAndCodingQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[3] = 33/2;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		try {
//			FileInputStream obj = new FileInputStream("tttt.txt");
//		}catch (Exception e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}
