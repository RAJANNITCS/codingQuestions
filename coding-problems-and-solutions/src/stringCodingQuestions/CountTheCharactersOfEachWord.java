package stringCodingQuestions;

import java.util.HashMap;

public class CountTheCharactersOfEachWord {
	public String s1 = " my name is rajan singh ";
	
	public void countTheCharacterOfEachWord() {
		this.s1 = this.s1.trim();
		String[] words = this.s1.split(" ");
		HashMap<String,Integer> temp = new HashMap<String, Integer>();
		
		for (String word: words) {
			temp.put(word, word.length());
		}
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		CountTheCharactersOfEachWord obj = new CountTheCharactersOfEachWord();
		obj.countTheCharacterOfEachWord();
	}
}
 