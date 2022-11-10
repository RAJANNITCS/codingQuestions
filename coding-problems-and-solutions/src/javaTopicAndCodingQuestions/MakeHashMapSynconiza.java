package javaTopicAndCodingQuestions;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class MakeHashMapSynconiza {
	public static void main(String[] args) {
		Map<Integer,String> temp = new HashMap<>();
		
		temp.put(1, "A");
		temp.put(2, "B");
		temp.put(3, "C");
		temp.put(4, "D");
		temp.put(5, "E");
		System.out.println(temp);
		
		Map<Integer, String > tem_1 = Collections.synchronizedMap(temp);
		System.out.println(tem_1);
	}
}
