package javaTopicAndCodingQuestions;

class King1 {
	private static King1 king = null;
	
	private King1 () {
		
	}
	
	public static King1 getObject() {
		if (king == null) {
			king = new King1();
		}
		return king;
	}
}

public class LazyInitialization {
	public static void main(String[] args) {
		King1 k1 = King1.getObject();
		King1 k2 = King1.getObject();
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
	}
}
