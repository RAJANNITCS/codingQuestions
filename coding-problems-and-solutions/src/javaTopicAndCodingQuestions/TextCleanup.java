package javaTopicAndCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class TextCleanup {

	public static String stringCleanup(String text) {

		String tempText = text;
		// apply lowercase rule
		tempText = tempText.toLowerCase();
		// remove non-alphanumeric characters excluding whitespace and hyphens - non
		// perfect
		tempText = tempText.replaceAll("[^a-zA-Z0-9\\s-]", "");
		// special rule: trailing double quote characters don't get caught by above
		// regex
		if (tempText.endsWith("")) {
			StringBuffer s1 = new StringBuffer();
			for (int i = 0; i < tempText.length(); i++) {
				s1.append(tempText.charAt(i));
			}

			tempText = new String(s1);
		}
		// remove plurality(trim letter s from end of each word in the string, if
		// present and word is n't ending in 'ss' or 'is')
		tempText = tempText.replaceAll("\\Be?s\\b", "");
		// remove tensing(trim 'ed' and 'ind' endings from each non-ending word and
		// replace with 'e')
		String[] words = tempText.split(" ");

		for (String word : words) {
			if (word.matches("[\\w]+(?:ing)")) {
				String s1 = word.substring(0, word.length() - 3);
				tempText = tempText.replaceAll(word, s1 + 'e');
			} else if (word.matches("[\\w]+(?:ed)")) {
				String s1 = word.substring(0, word.length() - 1);
				tempText = tempText.replaceAll(word, s1);
			}
		}
		return tempText;
	}

	public static void main(String[] args) {
		List<String> statementTitles = new ArrayList<String>();
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		statementTitles.add("\"texts wrapped string in double seating quotes\"");
		
		
//		List<String> newStatementsTitles = new ArrayList<String>();
//		for (String statementTitle : statementTitles) {
//			newStatementsTitles.add(stringCleanup(statementTitle));
//		}
				
//		words.replaceAll(s -> s != null ? s : "");
//		
//		for (int i = 0; i < statementTitles.size(); i++) {
//			statementTitles.set(i, stringCleanup(statementTitles.get(i)));
//		}
		
		statementTitles.replaceAll(s -> s != null ? stringCleanup(s) : s);
		
		System.out.println(statementTitles);
	}
}