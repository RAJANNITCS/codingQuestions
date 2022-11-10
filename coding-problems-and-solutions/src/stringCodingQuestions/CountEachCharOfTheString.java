package stringCodingQuestions;

import java.util.HashMap;

public class CountEachCharOfTheString {
	public String s1 = "my name is rajan singh";
	
	public void countEachCharOfString() {
		HashMap<Character,Integer> temp = new HashMap<Character, Integer>();
		
		for (int i = 0; i < this.s1.length() - 1; i++) {
			if (this.s1.charAt(i) != ' ') {
				temp.put(this.s1.charAt(i),temp.containsKey(this.s1.charAt(i)) ? 
						temp.get(this.s1.charAt(i)) + 1 : 1);
			}
		}
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		CountEachCharOfTheString obj = new CountEachCharOfTheString();
		obj.countEachCharOfString();
	}
}
