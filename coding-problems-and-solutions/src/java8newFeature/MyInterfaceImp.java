// create separate class and implements funcational interface or interface
package java8newFeature;

public class MyInterfaceImp implements MyInterface{
	
	@Override
	public void sayHello() {
		System.out.println("Hi jon");
	}
	
	public static void main(String[] args) {
		MyInterfaceImp obj = new MyInterfaceImp();
		obj.sayHello();
	}
}
