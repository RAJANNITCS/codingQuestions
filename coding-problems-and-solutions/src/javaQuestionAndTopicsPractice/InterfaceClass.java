package javaQuestionAndTopicsPractice;

interface Bike4 {
	public void run();
}

class Honda1 implements Bike4 {
	
	public void run() {
		System.out.println("run Honda bike");
	}
}
public class InterfaceClass {
	public static void main(String[] args) {
		Honda1 obj = new Honda1();
		obj.run();
	}
}
