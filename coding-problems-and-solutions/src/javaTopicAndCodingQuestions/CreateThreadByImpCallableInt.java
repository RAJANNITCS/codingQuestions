package javaTopicAndCodingQuestions;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThreadByImpCallableInt implements Callable<String>{
	
	@Override
	public String call() {
		return "rohan";
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CreateThreadByImpCallableInt obj = new CreateThreadByImpCallableInt();
		FutureTask<String> s1 = new FutureTask<String>(obj);
		Thread t1 = new Thread(s1);
		t1.start();
		System.out.println(s1.get());
	}
}
