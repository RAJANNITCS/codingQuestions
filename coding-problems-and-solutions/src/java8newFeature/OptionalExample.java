package java8newFeature;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String s1 = null;
		s1 = new String("rohan");
		
		Optional<String> obj = Optional.ofNullable(s1);
		
		if (obj.isEmpty()) {
			System.out.println("String is empty");
		}else {
			System.out.println(s1);
		}
	}
}
