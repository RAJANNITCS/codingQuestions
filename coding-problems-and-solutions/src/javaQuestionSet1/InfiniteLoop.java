package javaQuestionSet1;

public class InfiniteLoop {
	
	public static void main(String[] args) {
//		for (int i = 0;true; i++) {
//			System.out.println("Hello "+i);
//		}
		
		int i = 0; 
//		while (true) {
//			System.out.println("Hello World"+i);
//			i++;
//		}
		
		do {
			System.out.println("Hello world" + i);
			i++;
		}while(true);
	}
}
