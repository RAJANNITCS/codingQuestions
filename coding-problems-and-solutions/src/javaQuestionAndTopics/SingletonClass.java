package javaQuestionAndTopics;

class King {
	private static King king;
	
	public static King getInstance() {
		if (king == null) {
			king = new King();
		}
		return king;
	}
	
	private King() {
		
	}
}

public class SingletonClass {
	public static void main(String[] args) {
		 King k1 = King.getInstance();
		 King k2 = King.getInstance();
		 King k3 = King.getInstance();
		 
		 System.out.println(k1.hashCode());
		 System.out.println(k2.hashCode());
		 System.out.println(k3.hashCode());
	}
}
