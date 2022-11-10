package javaTopicAndCodingQuestions;

class Test {
	
	public String getClass(Object obj) {
		Class s1 = obj.getClass();
		return s1.getSimpleName();
	}
}

public class ReflectionApiTest {
	public static void main(String[] args) {
		ReflectionApiTest obj = new ReflectionApiTest();
		Test t1 = new Test();
		System.out.println(t1.getClass(obj));
	}
}
