package javaCode;

public class FinalizeMethodExample {
	public static void main(String[] args) {
		FinalizeMethodExample obj = new FinalizeMethodExample();
		System.out.println("Hashcode is:"+ obj.hashCode());
		
		obj = null;
		
		// calling the garbage collector using gc()
		
		System.gc();
		
		System.out.println("End of the grabage collector");
	}
	
	protected void finalize() {
		System.out.println("Called the finalize() method");
	}
}
