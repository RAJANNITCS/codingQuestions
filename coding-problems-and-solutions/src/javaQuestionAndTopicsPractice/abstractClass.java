package javaQuestionAndTopicsPractice;

abstract class Bike3 {
	
	public abstract void run();
}

class Honda extends Bike3 {
	
	public void run() {
		System.out.println("run honda bike");
	}
}

public class abstractClass {
	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.run();
	}
}
