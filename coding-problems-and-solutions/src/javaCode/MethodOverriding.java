package javaCode;

class Animal {
	
	public void eat() {
		System.out.println("eating ...........");
	}
}

class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("eating braead ........");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();
	}
}
