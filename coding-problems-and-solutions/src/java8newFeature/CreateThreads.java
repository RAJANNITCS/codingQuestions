package java8newFeature;

public class CreateThreads {
	public static void main(String[] args) {
		Runnable t1 = ()-> {
			System.out.println("thread one start");
		};
		
		Thread obj = new Thread(t1);
		obj.start();
	}
}
