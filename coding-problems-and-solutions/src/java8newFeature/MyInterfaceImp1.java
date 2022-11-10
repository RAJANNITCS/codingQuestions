// anonymous class for implementing functional interface or interface
package java8newFeature;

public class MyInterfaceImp1 {
	public static void main(String[] args) {
		MyInterface i = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Hi jon");
			}
		};
		
		i.sayHello();
		
		MyInterface i2 = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Hi rohan");
				
			}
		};
		
		i2.sayHello();
	}
}
