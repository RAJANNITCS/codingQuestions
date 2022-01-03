package javaQuestionSet1;

public class FinalizeBlockIn {
	  public static void main(String[] args)   
	    {   
		  FinalizeBlockIn obj = new FinalizeBlockIn();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	        // calling garbage collector    
	        System.gc();   
	        System.out.println("end of garbage collection");   
	  
	    }   
	    @Override  
	    protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
}
