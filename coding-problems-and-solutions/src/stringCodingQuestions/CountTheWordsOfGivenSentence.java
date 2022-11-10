package stringCodingQuestions;

import java.util.HashMap;


public class CountTheWordsOfGivenSentence {
	public String s1 = " my name is rajan singh and my father name is anil singh ";
	
	public void countTheWordOfGivenString() {
		this.s1 = this.s1.trim();
		String[] words = this.s1.split(" ");
		HashMap<String,Integer> temp = new HashMap<String, Integer>();
		
		for (String word: words) {
			temp.put(word,temp.containsKey(word) ? temp.get(word) +1 : 1);
		}
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		CountTheWordsOfGivenSentence obj = new CountTheWordsOfGivenSentence();
		obj.countTheWordOfGivenString();
	}
}
