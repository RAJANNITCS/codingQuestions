package javaTopicAndCodingQuestions;
import java.util.Scanner;

class YoungeAgeException extends RuntimeException {
	
	public YoungeAgeException(String msg) {
		super(msg);
	}
}

public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new YoungeAgeException("you are not eligible");
			}else {
				System.out.println("you can vot");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
