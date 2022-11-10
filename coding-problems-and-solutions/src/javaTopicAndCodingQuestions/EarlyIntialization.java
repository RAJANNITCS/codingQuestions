package javaTopicAndCodingQuestions;

class King {
	private final static King king = new King();
	
	private King() {
		
	}
	
	public static King getObject() {
		return king;
	}
}

public class EarlyIntialization {
	public static void main(String[] args) {
		King k1 = King.getObject();
		King k2 = King.getObject();
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
	}
}
