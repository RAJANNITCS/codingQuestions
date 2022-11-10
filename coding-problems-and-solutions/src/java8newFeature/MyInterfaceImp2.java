package java8newFeature;

public class MyInterfaceImp2 {
	public static void main(String[] args) {
		MyInterface i = () -> {
			System.out.println("hi jon");
		};
		
		MyInterface i2 = () -> {
			System.out.println("Hi mohan");
		};
		
		i.sayHello();
		i2.sayHello();
	}
}
